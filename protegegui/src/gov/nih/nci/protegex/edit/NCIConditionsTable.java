package gov.nih.nci.protegex.edit;

import java.awt.Color;
import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPopupMenu;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import javax.swing.text.View;

import edu.stanford.smi.protege.model.Cls;
import edu.stanford.smi.protegex.owl.model.OWLAnonymousClass;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLProperty;
import edu.stanford.smi.protegex.owl.model.OWLRestriction;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFResource;
import edu.stanford.smi.protegex.owl.model.RDFSClass;
import edu.stanford.smi.protegex.owl.model.triplestore.Triple;
import edu.stanford.smi.protegex.owl.model.triplestore.impl.DefaultTriple;
import edu.stanford.smi.protegex.owl.ui.ProtegeUI;
import edu.stanford.smi.protegex.owl.ui.ResourceRenderer;
import edu.stanford.smi.protegex.owl.ui.clsdesc.ClassDescriptionEditorComponent;
import edu.stanford.smi.protegex.owl.ui.clsdesc.ClassDescriptionTextField;
import edu.stanford.smi.protegex.owl.ui.code.SymbolEditorComponent;
import edu.stanford.smi.protegex.owl.ui.code.SymbolErrorDisplay;
import edu.stanford.smi.protegex.owl.ui.code.SymbolPanel;
import edu.stanford.smi.protegex.owl.ui.code.SymbolTextField;
import edu.stanford.smi.protegex.owl.ui.conditions.ConditionsTableConstants;
import edu.stanford.smi.protegex.owl.ui.conditions.PropertyConditionsDisplay;
import edu.stanford.smi.protegex.owl.ui.conditions.SeparatorCellRenderer;
import edu.stanford.smi.protegex.owl.ui.icons.OWLIcons;
import edu.stanford.smi.protegex.owl.ui.owltable.OWLTable;

import edu.stanford.smi.protege.util.StringUtilities;

/**
 *@Author: NGIT, Kim Ong; Iris Guo
 */

public class NCIConditionsTable extends OWLTable
        implements ConditionsTableConstants, PropertyConditionsDisplay {
	
	private static final long serialVersionUID = 441936038070346936L;

    private SeparatorCellRenderer separatorCellRendererGrayed = new SeparatorCellRenderer(true);

    private NCIConditionsTableModel tableModel;

    public NCIConditionsTable(OWLModel owlModel, NCIConditionsTableModel aTableModel) {
        super(aTableModel, owlModel, true);
        this.tableModel = aTableModel;

        // Per Timothy Redmond [tredmond@stanford.edu], 06/12/07
        setTransferHandler(null);
        //setTransferHandler(new ConditionsTableTransferHandler(owlModel));
    }

    public NCIConditionsTable(OWLModel owlModel, NCIConditionsTableModel aTableModel,
                              NCIEditTab tab) {
        super(aTableModel, owlModel, true);
        this.tableModel = aTableModel;

        // Per Timothy Redmond [tredmond@stanford.edu], 06/12/07
        setTransferHandler(null);
        //setTransferHandler(new ConditionsTableTransferHandler(owlModel));
    }


    protected void addNavigationMenuItems(RDFResource resource, JPopupMenu menu) {
        super.addNavigationMenuItems(resource, menu);
        int row = getSelectedRow();
        if (tableModel.getType(row) == NCIConditionsTableModel.TYPE_INHERITED) {
            final RDFSClass definingClass = tableModel.getOriginClass(row);
            menu.add(new AbstractAction("Navigate to defining class (" +
                    definingClass.getBrowserText() + ")", ProtegeUI.getIcon(definingClass)) {
            	private static final long serialVersionUID = 441936038070346937L;
                public void actionPerformed(ActionEvent e) {
                    navigateTo(definingClass);
                }
            });
        }
    }


    public void addRestriction(OWLRestriction restriction) {
        addRow(restriction);
    }


    public int addRow(Cls cls) {
        if (cls.equals(tableModel.getEditedCls())) {
            tableModel.displaySemanticError("Cannot assign " +
                    cls.getBrowserText() + " to itself.");
            return -1;
        }
        else {
            RDFSClass rdfsClass = (RDFSClass) cls;
            if (tableModel.addRow(rdfsClass, getSelectedRow())) {
                setSelectedRow(rdfsClass);
                return tableModel.getClassRow(rdfsClass);
            }
            else {
                tableModel.displaySemanticError("Could not add " + cls.getBrowserText() + ".");
                if (rdfsClass instanceof OWLAnonymousClass) {
                    rdfsClass.delete();
                }
                return -1;
            }
        }
    }


    public void createAndEditRow() {
        int selectedRow = getSelectedRow();
        createAndEditRow(selectedRow);
    }


    private void createAndEditRow(int selectedRow) {
        if (selectedRow >= 0 && tableModel.getType(selectedRow) != TYPE_INHERITED) {
            int row = tableModel.addEmptyRow(selectedRow);
            editExpression(row);
        }
    }


    protected ResourceRenderer createOWLFrameRenderer() {
        return new ResourceRenderer() {
        	private static final long serialVersionUID = 441936038070346939L;

            private Icon icon;

            private Cls originCls;


            protected void loadCls(Cls cls) {
                int row = tableModel.getClassRow((RDFSClass) cls);
                originCls = null;
                boolean grayed = false;
                if (cls instanceof OWLAnonymousClass && tableModel.getType(row) == TYPE_INHERITED) {
                    Icon baseIcon = cls.getIcon();
                    if (baseIcon instanceof ImageIcon) {
                        setMainIcon(OWLIcons.getInheritedClsIcon((ImageIcon) baseIcon));
                    }
                    else {
                        setMainIcon(baseIcon);
                    }
                    super.loadClsAfterIcon(cls);
                    originCls = tableModel.getOriginClass(row);
                    grayed = true;
                }
                else {
                    super.loadCls(cls);
                }
                icon = tableModel.getIcon(row, getRowHeight());
                setGrayedText(grayed);
            }


            public void paint(Graphics g) {
                super.paint(g);
                
                int width = getWidth();
                if (icon != null) {
                    final int x = width - icon.getIconWidth() - 3;
                    icon.paintIcon(this, g, x, 1);
                    if (originCls != null) {
                        FontMetrics fm = _fontMetrics;
                        int mainTextLength = fm.stringWidth(getMainText());

                        int ascent = fm.getAscent();
                        final String browserText = originCls.getBrowserText();
                        String str = "[from " + browserText + "]";
                        int strWidth = fm.stringWidth(str);
                        int c = browserText.length();
                        while (c > 3 && x - strWidth - 2 <= mainTextLength + 26) {
                            c--;
                            str = "[from " + browserText.substring(0, c) + "...]";
                            strWidth = fm.stringWidth(str);
                        }
                        if (x - strWidth - 2 > mainTextLength + 26) {
                            g.setColor(Color.gray);
                            g.drawString(str, x - strWidth - 2, ascent);
                        }
                    }
                }
            }


            public Component getTableCellRendererComponent(JTable jTable,
                                                           Object o,
                                                           boolean b,
                                                           boolean b1,
                                                           int i,
                                                           int i1) {
                Component c = super.getTableCellRendererComponent(jTable, o, b, b1, i, i1);
                int prefHeight = c.getPreferredSize().height;
                if (jTable.getRowHeight(i) != prefHeight) {
                    // Adjust the pos of the symbol panel
                    SymbolPanel symbolPanel = getSymbolPanel();
                    jTable.setRowHeight(i, prefHeight);
                    symbolPanel.setLocation(symbolPanel.getX(), symbolPanel.getY() + prefHeight);
                    symbolPanel.repaint();
                }
                return c;
            }
        };
    }


    protected int getPreferredRowHeight(JTable table,
                                        SymbolEditorComponent editorComponent) {
        View v = editorComponent.getTextComponent().getUI().getRootView(editorComponent.getTextComponent());
        v.setSize(table.getWidth(), Integer.MAX_VALUE);
        return (int) v.getPreferredSpan(View.Y_AXIS);
    }


    protected JPopupMenu createPopupMenu() {
		/*
        JPopupMenu menu = super.createPopupMenu();
        int selectedRow = getSelectedRow();
        if (selectedRow >= 0 && tableModel.isDefinition(selectedRow)) {
            JMenuItem item = menu.add(new AbstractAction("Create new necessary & sufficient block",
                    Icons.getBlankIcon()) {
                public void actionPerformed(ActionEvent e) {
                    int row = tableModel.addEmptyDefinitionBlock();
                    setSelectedRow(row);
                }
            });
            menu.add(item, 0);
            menu.add(new JPopupMenu.Separator(), 1);
        }

        return menu;
        */
        return new JPopupMenu();
    }


    protected SymbolTextField createSymbolTextField(OWLModel owlModel,
                                                    SymbolErrorDisplay errorDisplay) {
        return new ClassDescriptionTextField(owlModel, errorDisplay);
    }


    protected SymbolEditorComponent createSymbolEditorComponent(OWLModel model,
                                                                SymbolErrorDisplay errorDisplay) {
        return new ClassDescriptionEditorComponent(model, errorDisplay, true);
    }


    public void displayRowsWithProperty(OWLProperty property) {
        getOWLFrameRenderer().setFocusedFrame(property);
        repaint();
    }


    public TableCellRenderer getCellRenderer(int row, int column) {
        if (column == COL_EXPRESSION && tableModel.isSeparator(row)) {
            return separatorCellRendererGrayed;
        }
        else {
            return super.getCellRenderer(row, column);
        }
    }

    public List getPrototypeTriples() {
        int[] sels = getSelectedRows();
        if (sels.length == 1 && tableModel.isSeparator(sels[0])) {
            RDFProperty predicate = null;
            if (tableModel.isDefinition(sels[0])) {
                predicate = getOWLModel().getOWLEquivalentClassProperty();
            }
            else {
                predicate = getOWLModel().getRDFSSubClassOfProperty();
            }
            return Collections.singletonList(new DefaultTriple(tableModel.getEditedCls(), predicate, null));
        }
        return super.getPrototypeTriples();
    }


    public void hideSymbolPanel() {
        super.hideSymbolPanel();
        tableModel.removeEmptyRow();
    }


    protected boolean isTableHeaderHidden() {
        return true;
    }


    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            if (tableModel.isSeparator(i) && tableModel.isDefinition(i)) {
                int count = tableModel.getBlockSize(i + 1);
                if (count > 0) {
                    paintEquivalentBlock(g, i + 1, count);
                }
            }
        }
    }


    private void paintEquivalentBlock(Graphics g, int startIndex, int rowCount) {
        int width = getWidth();
        int rowHeight = getRowHeight();
        final int rx = width - 35;
        final int ry = rowHeight * startIndex + 1;
        final int rw = 31;
        final int rh = rowHeight * rowCount - 2;
        g.setColor(new Color(255, 200, 128));
        g.fillRect(rx, ry, rw, rh);
        g.setColor(new Color(110, 110, 110));
        g.drawRect(rx, ry, rw, rh);
        int middle = ry + rh / 2;
        g.setColor(Color.black);
        int lx1 = rx + 13;
        int lx2 = rx + 18;
        g.drawLine(lx1, middle - 2, lx2, middle - 2);
        g.drawLine(lx1, middle, lx2, middle);
        g.drawLine(lx1, middle + 2, lx2, middle + 2);
    }

    


    public void selectNecessaryIfNothingSelected() {
        int selectedRow = getSelectedRow();
        if (selectedRow < 0) {
            selectedRow = 1;
            while (tableModel.getType(selectedRow) != NCIConditionsTableModel.TYPE_SUPERCLASS) {
                selectedRow++;
            }
            setSelectedRow(selectedRow);
        }
    }


    public void setSelectedTriples(Collection triples) {
        tableModel.refresh();
        Iterator it = triples.iterator();
        if(it.hasNext()) {
            Triple triple = (Triple) it.next();
            if(triple.getObject() instanceof RDFSClass) {
                RDFSClass cls = (RDFSClass) triple.getObject();
                setSelectedRow(cls);
            }
        }
    }


    public void setValueAt(Object aValue, int row, int column) {
        tableModel.previouslyEditedCls = null;
        if (aValue instanceof String) {
            try {
                String text = (String) aValue;
                getOWLModel().getOWLClassParser().checkClass(getOWLModel(), text);
                super.setValueAt(aValue, row, column);
                if (tableModel.previouslyEditedCls != null) {
                    setSelectedRow((RDFSClass) tableModel.previouslyEditedCls);
                }
            }
            catch (Exception ex) {
                // Ignore: User has clicked somewhere else on the table while editing invalid expression
            }
        }
    }
}



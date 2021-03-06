package edu.stanford.smi.protegex.owl.ui.menu.code;

import java.awt.Dimension;
import java.awt.Font;
import java.io.IOException;
import java.io.StringWriter;
import java.util.logging.Level;

import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.apache.xml.serialize.OutputFormat;
import org.apache.xml.serialize.XMLSerializer;
import org.w3c.dom.Document;

import edu.stanford.smi.protege.util.Log;
import edu.stanford.smi.protegex.owl.inference.dig.exception.DIGReasonerException;
import edu.stanford.smi.protegex.owl.inference.dig.translator.DIGTranslator;
import edu.stanford.smi.protegex.owl.inference.dig.translator.DIGTranslatorFactory;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.ui.ProtegeUI;
import edu.stanford.smi.protegex.owl.ui.actions.AbstractOWLModelAction;
import edu.stanford.smi.protegex.owl.ui.actions.OWLModelActionConstants;
import edu.stanford.smi.protegex.owl.ui.dialogs.ModalDialogFactory;

/**
 * User: matthewhorridge<br>
 * The Univeristy Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: Sep 15, 2004<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 */
public class DIGAction extends AbstractOWLModelAction {

    public String getMenubarPath() {
        return CODE_MENU + PATH_SEPARATOR + OWLModelActionConstants.ONT_LANGUAGE_GROUP;
    }


    public String getName() {
        return "Show DIG code...";
    }


    public void run(OWLModel owlModel) {
        DIGTranslator translator = DIGTranslatorFactory.getInstance().createTranslator();
        Document doc = translator.createTellsDocument("");
        try {
            translator.translateToDIG(owlModel, doc, doc.getDocumentElement());
            OutputFormat outputFormat = new OutputFormat();
            outputFormat.setIndent(4);
            outputFormat.setIndenting(true);
            StringWriter writer = new StringWriter();
            XMLSerializer serializer = new XMLSerializer(writer, outputFormat);
            serializer.serialize(doc);
            JTextArea textArea = new JTextArea(writer.getBuffer().toString());
            textArea.setFont(new Font("Courier New", Font.PLAIN, 12));
            JScrollPane main = new JScrollPane(textArea);
            main.setPreferredSize(new Dimension(600, 600));
            ProtegeUI.getModalDialogFactory().showDialog(ProtegeUI.getTopLevelContainer(owlModel.getProject()), main,
                    "DIG Code", ModalDialogFactory.MODE_CLOSE);
        }
        catch (DIGReasonerException digEx) {
            Log.getLogger().log(Level.SEVERE, "Exception caught", digEx);
        }
        catch (IOException ioEx) {
          Log.getLogger().log(Level.SEVERE, "Exception caught", ioEx);
        }
    }
}


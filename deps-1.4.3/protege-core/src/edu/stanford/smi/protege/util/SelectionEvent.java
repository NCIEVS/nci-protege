package edu.stanford.smi.protege.util;

/**
 * An event fired by a {@link Selectable} object.
 *
 * @author    Ray Fergerson <fergerson@smi.stanford.edu>
 */
public class SelectionEvent extends AbstractEvent {
    public static final int SELECTION_CHANGED = 1;

    public SelectionEvent(Selectable selectable, int type) {
        super(selectable, type);
    }

    public Selectable getSelectable() {
        return (Selectable) getSource();
    }
}

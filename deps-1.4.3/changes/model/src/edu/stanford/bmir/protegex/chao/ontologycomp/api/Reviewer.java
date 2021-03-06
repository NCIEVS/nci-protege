package edu.stanford.bmir.protegex.chao.ontologycomp.api;

import java.util.Collection;

/**
 * Generated by Protege (http://protege.stanford.edu). Source Class: Reviewer
 * 
 * @version generated on Wed Sep 09 18:24:10 PDT 2009
 */
public interface Reviewer extends User {

    // Slot domainOfInterest

    Collection<Ontology_Component> getDomainOfInterest();

    boolean hasDomainOfInterest();

    void addDomainOfInterest(Ontology_Component newDomainOfInterest);

    void removeDomainOfInterest(Ontology_Component oldDomainOfInterest);

    void setDomainOfInterest(Collection<? extends Ontology_Component> newDomainOfInterest);

    // Slot name

    String getName();

    boolean hasName();

    void setName(String newName);

    // Slot pendingReview

    Collection<Ontology_Component> getPendingReview();

    boolean hasPendingReview();

    void addPendingReview(Ontology_Component newPendingReview);

    void removePendingReview(Ontology_Component oldPendingReview);

    void setPendingReview(Collection<? extends Ontology_Component> newPendingReview);

    // Slot watchedEntity

    Collection<Ontology_Component> getWatchedEntity();

    boolean hasWatchedEntity();

    void addWatchedEntity(Ontology_Component newWatchedEntity);

    void removeWatchedEntity(Ontology_Component oldWatchedEntity);

    void setWatchedEntity(Collection<? extends Ontology_Component> newWatchedEntity);

    void delete();

}

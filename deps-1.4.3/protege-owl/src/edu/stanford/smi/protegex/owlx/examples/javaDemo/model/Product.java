package edu.stanford.smi.protegex.owlx.examples.javaDemo.model;

import edu.stanford.smi.protegex.owl.model.OWLIndividual;
import edu.stanford.smi.protegex.owl.model.RDFProperty;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/javaDemo.owl#Product
 *
 * @version generated on Mon Feb 21 10:30:53 EST 2005
 */
public interface Product extends OWLIndividual {

    // Property http://www.owl-ontologies.com/javaDemo.owl#price


    float getPrice();


    RDFProperty getPriceProperty();


    boolean hasPrice();


    void setPrice(float newPrice);
}
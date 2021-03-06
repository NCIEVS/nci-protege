package edu.stanford.smi.protegex.owlx.examples.javaDemo.model;

import edu.stanford.smi.protegex.owl.model.OWLIndividual;
import edu.stanford.smi.protegex.owl.model.RDFProperty;
import edu.stanford.smi.protegex.owl.model.RDFSLiteral;

/**
 * Generated by Protege-OWL  (http://protege.stanford.edu/plugins/owl).
 * Source OWL Class: http://www.owl-ontologies.com/javaDemo.owl#Purchase
 *
 * @version generated on Mon Feb 21 10:53:08 EST 2005
 */
public interface Purchase extends OWLIndividual {

    // Property http://www.owl-ontologies.com/javaDemo.owl#customer


    Customer getCustomer();


    RDFProperty getCustomerProperty();


    boolean hasCustomer();


    void setCustomer(Customer newCustomer);

    // Property http://www.owl-ontologies.com/javaDemo.owl#date


    RDFSLiteral getDate();


    RDFProperty getDateProperty();


    boolean hasDate();


    void setDate(RDFSLiteral newDate);

    // Property http://www.owl-ontologies.com/javaDemo.owl#product


    Product getProduct();


    RDFProperty getProductProperty();


    boolean hasProduct();


    void setProduct(Product newProduct);
}

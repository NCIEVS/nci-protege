/* CVS $Id: AbsoluteLayoutNames.java,v 1.2 2005/12/31 14:08:16 matthewhorridge Exp $ */
package edu.stanford.smi.protegex.owl.ui.forms; 
import com.hp.hpl.jena.ontology.DatatypeProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;
/**
 * Vocabulary definitions from file:/C:/protege-owl/owl/schemagen-temp.owl 
 * @author Auto-generated by schemagen on 27 Oct 2005 13:07 
 */
public class AbsoluteLayoutNames {
    /** <p>The ontology model that holds the vocabulary terms</p> */
    private static OntModel m_model = ModelFactory.createOntologyModel( OntModelSpec.OWL_MEM, null );
    
    /** <p>The namespace of the vocabulary as a string</p> */
    public static final String NS = "http://www.owl-ontologies.com/forms/absolute.owl#";
    
    /** <p>The namespace of the vocabulary as a string</p>
     *  @see #NS */
    public static String getURI() {return NS;}
    
    /** <p>The namespace of the vocabulary as a resource</p> */
    public static final Resource NAMESPACE = m_model.createResource( NS );
    
    public static final DatatypeProperty x = m_model.createDatatypeProperty( "http://www.owl-ontologies.com/forms/absolute.owl#x" );
    
    public static final DatatypeProperty y = m_model.createDatatypeProperty( "http://www.owl-ontologies.com/forms/absolute.owl#y" );
    
    public static final DatatypeProperty height = m_model.createDatatypeProperty( "http://www.owl-ontologies.com/forms/absolute.owl#height" );
    
    public static final DatatypeProperty width = m_model.createDatatypeProperty( "http://www.owl-ontologies.com/forms/absolute.owl#width" );
    
    public static final OntClass AbsoluteLayoutData = m_model.createClass( "http://www.owl-ontologies.com/forms/absolute.owl#AbsoluteLayoutData" );
    
}
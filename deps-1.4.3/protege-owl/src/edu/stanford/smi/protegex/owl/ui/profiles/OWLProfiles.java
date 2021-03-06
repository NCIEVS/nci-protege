/* CVS $Id: OWLProfiles.java,v 1.2 2005/04/15 02:29:47 knublauch Exp $ */
package edu.stanford.smi.protegex.owl.ui.profiles;

import com.hp.hpl.jena.ontology.ObjectProperty;
import com.hp.hpl.jena.ontology.OntClass;
import com.hp.hpl.jena.ontology.OntModel;
import com.hp.hpl.jena.ontology.OntModelSpec;
import com.hp.hpl.jena.rdf.model.ModelFactory;
import com.hp.hpl.jena.rdf.model.Resource;

/**
 * Vocabulary definitions from file:/C:/projects/owl/schemagen-temp.owl
 *
 * @author Auto-generated by schemagen on 29 Nov 2004 16:31
 */
public class OWLProfiles {

    /**
     * <p>The ontology model that holds the vocabulary terms</p>
     */
    private static OntModel m_model = ModelFactory.createOntologyModel(OntModelSpec.OWL_MEM, null);

    /**
     * <p>The namespace of the vocabulary as a string</p>
     */
    public static final String NS = "http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#";


    /**
     * <p>The namespace of the vocabulary as a string</p>
     *
     * @see #NS
     */
    public static String getURI() {
        return NS;
    }


    /**
     * <p>The namespace of the vocabulary as a resource</p>
     */
    public static final Resource NAMESPACE = m_model.createResource(NS);

    public static final ObjectProperty hasFeatures = m_model.createObjectProperty("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#hasFeatures");

    public static final OntClass SameAs_between_Properties = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#SameAs-between-Properties");

    public static final OntClass OWL_Full = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#OWL-Full");

    public static final OntClass OWLProperty_type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#OWLProperty-type");

    public static final OntClass RDF = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#RDF");

    public static final OntClass RDF_but_not_OWL = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#RDF-but-not-OWL");

    public static final OntClass RDFSClass_but_not_OWLClass_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#NamedRDFSClass-but-not-RDFSClass-Type");

    public static final OntClass Create_ObjectProperty = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Create-ObjectProperty");

    public static final OntClass OWL_Lite = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#OWL-Lite");

    public static final OntClass MaxCardinality_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#MaxCardinality-Restrictions");

    public static final OntClass Property_that_is_also_a_Class = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Property-that-is-also-a-Class");

    public static final OntClass Create_OWLClass = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Create-RDFSClass");

    public static final OntClass Union_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Union-Classes");

    public static final OntClass Profile = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Profile");

    public static final OntClass Disjoint_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Disjoint-Classes");

    public static final OntClass TransitiveProperties_that_are_FunctionalProperties = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#TransitiveProperties-that-are-FunctionalProperties");

    public static final OntClass Create_OWLIndividual = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Create-OWLIndividual");

    public static final OntClass MinCardinality_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#MinCardinality-Restrictions");

    public static final OntClass Class_that_is_also_a_Property = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Class-that-is-also-a-Property");

    public static final OntClass SomeValuesFrom_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#SomeValuesFrom-Restrictions");

    public static final OntClass CreateRDFProperty = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#CreateRDFProperty");

    public static final OntClass OWL_DL = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#OWL-DL");

    public static final OntClass OWLClass_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#RDFSClass-Type");

    public static final OntClass ObjectProperty_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#ObjectProperty-Type");

    public static final OntClass Enumerated_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Enumerated-Classes");

    public static final OntClass StatementPattern = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#StatementPattern");

    public static final OntClass DatatypeProperty_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#DatatypeProperty-Type");

    public static final OntClass DifferentFrom_between_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#DifferentFrom-between-Classes");

    public static final OntClass DifferentFrom_between_Properties = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#DifferentFrom-between-Properties");

    public static final OntClass Class_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Class-Type");

    public static final OntClass Property_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Property-Type");

    public static final OntClass TransitiveProperties_that_are_InverseFunctionalProperties = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#TransitiveProperties-that-are-InverseFunctionalProperties");

    public static final OntClass Create_DatatypeProperty = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Create-DatatypeProperty");

    public static final OntClass CreateRDFSClass = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#CreateRDFSClass");

    public static final OntClass Complement_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Complement-Classes");

    public static final OntClass HasValue_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#HasValue-Restrictions");

    public static final OntClass DataRanges = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#DataRanges");

    public static final OntClass SameAs_between_Classes = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#SameAs-between-Classes");

    public static final OntClass AllValuesFrom_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#AllValuesFrom-Restrictions");

    public static final OntClass RDFProperty_but_not_OWLProperty_Type = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#RDFProperty-but-not-OWLProperty-Type");

    public static final OntClass Qualified_Cardinality_Restrictions = m_model.createClass("http://protege.stanford.edu/plugins/owl/OWLProfiles.owl#Qualified-Cardinality-Restrictions");

}

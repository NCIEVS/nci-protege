package gov.nih.nci.protegex.test;

import edu.stanford.smi.protege.util.Log;
import edu.stanford.smi.protegex.owl.model.OWLClass;
import edu.stanford.smi.protegex.owl.model.OWLModel;
import edu.stanford.smi.protegex.owl.model.OWLNamedClass;
import edu.stanford.smi.protegex.owl.model.OWLObjectProperty;
import edu.stanford.smi.protegex.owl.model.RDFSClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RestrictionEdits implements ClientWorker {
	private static Logger logger = Log.getLogger(RestrictionEdits.class);
	private OWLModel model;
		
	private Random r = new Random();
	
	private OWLNamedClass root;
	private Set<OWLObjectProperty> createdProperties = new HashSet<OWLObjectProperty>();
	
	private String classPrefix = UUID.randomUUID().toString().replace("-","_");
	private int classCounter = 0;

	private String propertyPrefix = UUID.randomUUID().toString().replace("-","_");
	private int propertyCounter = 0;


	public void cleanUp() {
		root.delete();
		for (OWLObjectProperty p : createdProperties) {
			p.delete();
		}
	}


	public void doWork(int iterate) {
		newClassAndProperty();
		changeDefined();
	}
	
	private void newClassAndProperty() {
		OWLNamedClass c = null;
		while (c == null) {
			try {
				c  = model.createOWLNamedClass(classPrefix + classCounter++);
			}
			catch (Throwable t) {
				logger.log(Level.INFO, "create class failed", t);
				randomSleep();
			}
		}

		c.addSuperclass(root);
		c.removeSuperclass(model.getOWLThingClass());
		
		OWLObjectProperty p = null;
		while (p == null) {
			try {
				p = model.createOWLObjectProperty(propertyPrefix + propertyCounter++);
			}
			catch (Throwable t) {
				logger.log(Level.INFO, "property create failed", t);
				randomSleep();
			}
		}
		createdProperties.add(p);
		boolean success = false;
		while (!success) {
			try {
				model.beginTransaction("define a class");
				OWLNamedClass c1 = nextRandomClass();
				OWLObjectProperty p2 = nextRandomProperty();
				OWLNamedClass c2 = nextRandomClass();
				List<OWLClass> disjunts = new ArrayList<OWLClass>();
				disjunts.add(c1);
				disjunts.add(model.createOWLSomeValuesFrom(p2, c2));
				c.addEquivalentClass(model.createOWLUnionClass(disjunts));
				model.commitTransaction();
				success = true;
			}
			catch (Throwable t) {
				model.rollbackTransaction();
				logger.log(Level.INFO, "could not give class a definition", t);
				randomSleep();	
			}
		}
	}
	
	private void changeDefined() {
		boolean success = false;
		OWLNamedClass c = nextRandomClass();
		if (c.getDefinition() != null) {
			RDFSClass definition = c.getDefinition();
			while (!success) {
				try {
					model.beginTransaction("Definition to necessary condition");
					c.addSuperclass(definition.createClone());
					c.removeEquivalentClass(definition);
					model.commitTransaction();
					success = true;
				}
				catch (Throwable t) {
					model.rollbackTransaction();
					logger.log(Level.INFO, "could not give class a definition", t);
					randomSleep();
				}
			}
		}
		else {
			while (!success) {
				try {
					model.beginTransaction("Necessary condition to definition");
					RDFSClass superClass = null;
					for (Object o : c.getSuperclasses(false)) {
						if (o instanceof RDFSClass && !(o instanceof OWLNamedClass)) {
							superClass = (RDFSClass) o;
						}		
					}
					c.addEquivalentClass(superClass.createClone());
					c.removeSuperclass(superClass);
					model.commitTransaction();
					success = true;
				}
				catch (Throwable t) {
					model.rollbackTransaction();
					logger.log(Level.INFO, "could not give class a definition", t);
					randomSleep();
				}
			}
		}
	}
	
	private OWLNamedClass nextRandomClass() {
		return model.getOWLNamedClass(classPrefix + r.nextInt(classCounter));
	}

	@SuppressWarnings("unchecked")
	private OWLObjectProperty nextRandomProperty() {
		List properties = new ArrayList(model.getUserDefinedOWLObjectProperties());
		return (OWLObjectProperty) properties.get(r.nextInt(properties.size()));
	}
	
	
	public void init(OWLModel model, String fname) {
		this.model = model;
		root = model.createOWLNamedClass(UUID.randomUUID().toString().replace("-", "_"));
	}
	
	private void randomSleep() {
		long period = r.nextInt(1000);
		try {
			logger.info("Collision found - sleeping for " + period);
			Thread.sleep(period);
		}
		catch (Throwable t) {
			t.printStackTrace();
		}
	}

}

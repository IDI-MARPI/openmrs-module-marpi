package org.openmrs.module.marpi;

import org.junit.Test;
import org.openmrs.api.ConceptService;
import org.openmrs.test.BaseModuleContextSensitiveTest;
import org.openmrs.test.SkipBaseSetup;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.Assert;

@SkipBaseSetup
public class marpiActivatorTest extends BaseModuleContextSensitiveTest {
	
	private MarpiActivator activator;
	
	@Autowired
	private ConceptService conceptService;
	
	@Test
	public void testEvery() throws Exception {
		
		initializeInMemoryDatabase();
		authenticate();
		// this test class is to asset the actual number of cocepts added to the meta data package
		// to run this test , comment out the Htmlformentry iinitilaizer in the Activator class 
		
		// activator = new MarpiActivator();
		// activator.willRefreshContext();
		// activator.contextRefreshed();
		// activator.willStart();
		// activator.started();
		
		// System.out.println(conceptService.getAllConcepts().size());
		// Assert.assertEquals(conceptService.getAllConcepts().size(), 0);
	}
	
}

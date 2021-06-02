package org.openmrs.module.marpi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openmrs.api.PatientService;
import org.openmrs.api.context.Context;
import org.openmrs.test.BaseModuleContextSensitiveTest;

public class TestClass extends BaseModuleContextSensitiveTest {
	
	PatientService patientService;
	
	@Before
	public void init() throws Exception {
		patientService = Context.getPatientService();
	}
	
	@Test
	public void should_getAllPatients() throws Exception {
		Assert.assertEquals(patientService.getAllPatients().size(), 4);
	}
}

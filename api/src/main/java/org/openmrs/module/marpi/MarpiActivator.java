/**
 * This Source Code Form is subject to the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. OpenMRS is also distributed under
 * the terms of the Healthcare Disclaimer located at http://openmrs.org/license.
 *
 * Copyright (C) OpenMRS Inc. OpenMRS is a registered trademark and the OpenMRS
 * graphic logo is a trademark of OpenMRS Inc.
 */
package org.openmrs.module.marpi;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.module.BaseModuleActivator;
import org.openmrs.module.marpi.inntializer.FormsInitializer;
import org.openmrs.module.marpi.inntializer.Initializer;

/**
 * This class contains the logic that is run every time this module is either started or shutdown
 */
public class MarpiActivator extends BaseModuleActivator {
	
	private Log log = LogFactory.getLog(this.getClass());
	
	/**
	 * @see #started()
	 */
	public void started() {
		log.info("Started Marpi");
		
		try {
			
			for (Initializer initializer : getInitializers()) {
				initializer.started();
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @see #shutdown()
	 */
	public void shutdown() {
		log.info("Shutdown Marpi");
	}
	
	private List<Initializer> getInitializers() {
		List<Initializer> list = new ArrayList<Initializer>();
		//list.add(new ConceptsInitializer());
		list.add(new FormsInitializer(MarpiConstants.MODULE_ID));
		return list;
	}
	
}

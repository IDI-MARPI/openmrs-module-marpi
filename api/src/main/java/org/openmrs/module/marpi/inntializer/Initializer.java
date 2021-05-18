package org.openmrs.module.marpi.inntializer;

public interface Initializer {
	
	/**
	 * Run during the activator started method
	 */
	void started();
	
	/**
	 * Run during the activator stopped method
	 */
	void stopped();
}

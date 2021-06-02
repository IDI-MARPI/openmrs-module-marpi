# openmrs-module-marpi
Loads custom Forms And Concepts for IDI-MARPI Facility

Instructions
1. After loading the Uganda EMR concept SQL dump ,download the [sql dump here](./custom-Concepts/marpiCustomConcepts.sql) that contains custom MARPI concepts and also load it.

2. Build the module , `mvn clean install` and upload the generated `omod` file into the OpenMRS server to load the cistom forms.


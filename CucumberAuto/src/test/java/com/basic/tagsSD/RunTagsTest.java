package com.basic.tagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(

			//verwijderd die junkcharacters in de console
			monochrome=true,
			
			//automation runt zonder dat de browser opent, dit is om de code testen, wanneer alles goed gaat dat wil zeggen dat die test goed is gebouwd
			//dryRun = true,
			dryRun = false,
			//tags={"@Important"},//All scenario executed if this is tag for feature file 
				//	tags={"@Smoke"},//only tag with @Smoke
				//	tags={"@Smoke","@Regression"}, //AND condition both strings in double quotes
					tags={"@Smoke,@Regression"}, //OR condition;single string in double quotes 
			features={"src/test/resources/com/basic/tagsFF/"},
			glue={"com/basic/tagsSD/"},
			
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report10.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport10.html"
					
					}
		
			)
	
	public class RunTagsTest {
		
}

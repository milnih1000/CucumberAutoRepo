package com.basic.hooksSD;

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
			
			features={"src/test/resources/com/basic/hooksFF/"},
			glue={"com/basic/hooksSD/"},
			
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport5.html"
					}
		
			)
	
	public class RunHooksTest {
		
}

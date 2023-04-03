package com.basic.datatableSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(

			//verwijderd die junkcharacters in de console
			monochrome=true,
			
			//automation runt zonder dat de browser opent, dit is om de code testen, wanneer alles goed gaat dat wil zeggen dat die test goed is gebouwd
			dryRun = true,
			//dryRun = false,
			
			features={"src/test/resources/com/basic/datatableFF/"},
			glue={"com/basic/datatableSD/"},
			
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report3.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport3.html"
					}
		
			)
	
	public class RunDataTableTest {
		
}

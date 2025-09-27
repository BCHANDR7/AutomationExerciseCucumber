package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/AutomationExercise2.feature"},// Path to your feature files
		glue = {"stepDefinition","hooks"},// Package where step definitions and hook are located
		plugin = {"pretty","html:CucumberReport/myreport.html"},// Reporting options
		//monochrome = true, // Make console output more readable
		publish = true,
		dryRun = false// dry run check all scenario steps having in stepdefinition file	
		)


public class Runner {

}

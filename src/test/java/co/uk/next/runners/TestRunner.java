package co.uk.next.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/co/uk/next/features",
		glue= {"co/uk/next/hooks","co/uk/next/stepdefinitions"}
		)
public class TestRunner {

}

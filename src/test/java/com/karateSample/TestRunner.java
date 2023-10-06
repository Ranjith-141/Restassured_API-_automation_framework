package com.karateSample;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(

		features="src/test/java/Feature",
		glue={"src/test/java/DemoCertificateProxy"},
		junit="--step-notifications",
		dryRun=false, strict = true, monochrome=true, plugin=
	    {"pretty","html:test-output", "json:target/json_output/cucumber.json",
		"html:target/cucumber-report-html", "rerun:target/rerun.txt"}, tags = {"@APIRequest"}

		)

public class TestRunner {

}

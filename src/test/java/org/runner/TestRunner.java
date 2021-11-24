package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = { "org.logindetail" }, monochrome = true, plugin = { "pretty",
		"json:src/test/resources/Reports/output.json" }, dryRun = false)

public class TestRunner {
	@AfterClass
	public static void afterClass() {
		String path = System.getProperty("user.dir");
		Reporting.generateReport(path + "\\src\\test\\resources\\Reports\\output.json");
	}
}

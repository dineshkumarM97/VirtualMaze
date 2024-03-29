package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.stepdef", tags = "@forgot", dryRun = false, plugin = {
		"pretty", "json:target/cucumber.json" })
public class TestRunner {
	@AfterClass
	public static void afterMethod() {
		JVMReport.genrateJVMReport(System.getProperty("user.dir") + "\\target\\cucumber.json");

	}
}

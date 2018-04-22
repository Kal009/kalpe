package com.qa.works;

import courgette.api.CourgetteOptions;
import courgette.api.CourgetteRunLevel;
import courgette.api.junit.Courgette;
import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CourgetteOptions(
        threads = 10,
        runLevel = CourgetteRunLevel.FEATURE,
        rerunFailedScenarios = true,
        showTestOutput = true,
        cucumberOptions = @CucumberOptions(
                features = ".",
                plugin = {
                        "pretty",
                        "json:target/cucumber-report/cucumber.json",
                        "html:target/cucumber-report/cucumber.html"},
                strict = true
        ))
public class RunCukesTest {
}

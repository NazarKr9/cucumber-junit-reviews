package com.cydeo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber_reports.html"}, //location for reports
        features = "src/test/resources/features",
        glue = "com/cydeo/step_definitions",
        tags = "@validLogin",
        dryRun = false, // in order to get snippets
        publish = true //to generate public link for reports
)


public class CukesRunner {

}

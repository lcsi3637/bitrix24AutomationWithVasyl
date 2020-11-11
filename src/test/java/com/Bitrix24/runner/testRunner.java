package com.Bitrix24.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith( Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/Bitrix24/step_definitions",
        dryRun = false
)
public class testRunner {
//@TaskFeature
}

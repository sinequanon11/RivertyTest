package RivertyTest.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },

        features = "src/test/resources/features",
        glue = {"RivertyTest/stepdefinitions", "RivertyTest/hooks"},
        tags = "@testriverty"
)

public class Runner {
}

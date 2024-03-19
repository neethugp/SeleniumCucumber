package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


    @CucumberOptions(
            features= {"src/resources/features"},
            glue= {"stepdefinitions", "hooks"},
            tags= "@EndToEnd",
            plugin= {"pretty",
                    "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
    )

    public class TestRunner extends AbstractTestNGCucumberTests {
}

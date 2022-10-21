package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, // buraya feature files in path i verilecek
        glue={"StepDefinitions"} // Step definitions ın klasörü yazılıyor.
)
public class _01_TestRunner extends AbstractTestNGCucumberTests {

}

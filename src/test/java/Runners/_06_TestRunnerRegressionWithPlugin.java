package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( // or olduğunda herhangi bir tanesi varsa çalıştırır.
        // and olduğunda her ikisininde senaoryoda tag olarak olan senaryoları çalıştırır.
        tags="@Regression", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles/"},
        glue={"StepDefinitions"},
        plugin={"html:target/cucumber-reports.html"}
        // mac için plugin / (tek) yan çizgi ile uygulanmaktadır.
)
public class _06_TestRunnerRegressionWithPlugin extends AbstractTestNGCucumberTests {
}

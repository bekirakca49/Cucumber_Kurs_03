package Runners;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions( // or olduğunda herhangi bir tanesi varsa çalıştırır.
        // and olduğunda her ikisininde senaoryoda tag olarak olan senaryoları çalıştırır.
        tags="@Regression", // hangi senaryolarda bu etiket varsa onlar çalıştırılacak
        features = {"src/test/java/FeatureFiles/"},
        glue={"StepDefinitions"},
        dryRun=false
)
public class _05_TestRunnerRegression extends AbstractTestNGCucumberTests {
}// Browser tipi vermek için, rapora ek parametre eklemek için sonra kullanacağız.

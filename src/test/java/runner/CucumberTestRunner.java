package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org/schuck/step_definitions"},
        plugin = {"pretty", "html:target/TestReport.html", "json:target/cucumber.json"},
        monochrome = true,
        publish = true)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

//    @Override
    @DataProvider(parallel = true)
    public Object[][] scenario() {
        return super.scenarios();
    }
}

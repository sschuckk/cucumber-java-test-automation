package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

/**
 * This class serves as the TestNG runner class for executing Cucumber tests.
 */
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"org/schuck/step_definitions"},
        plugin = {"pretty", "html:target/TestReport.html", "json:target/cucumber.json"},
        monochrome = true,
        publish = true)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    // TODO: Verify why cant run test in parallel
    // @Override
    @DataProvider(parallel = true)
    public Object[][] scenario() {
        return super.scenarios();
    }
}

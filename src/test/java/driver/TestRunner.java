package driver;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/java/Features/",
        glue = "StepDef",
        dryRun = false,
        monochrome = true,
        plugin = {"pretty","html:test-out.html"})
public class TestRunner {
}

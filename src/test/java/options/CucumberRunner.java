package options;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features  = {"src/test/features"},
        glue = {"StepDefinitions"},
        monochrome = true,
          plugin = {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
)
public class CucumberRunner { }



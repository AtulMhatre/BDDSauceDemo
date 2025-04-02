package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = { "src/test/resources/Features" },
glue = { "stepsDefinations" }, 
plugin = {"pretty", "html:target/htmlreport.html"})

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

}

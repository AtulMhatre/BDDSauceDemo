package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@sanity and @regression or @perf", features = { "src/test/resources/FeaturesWithTags" },
glue = { "stepsDefinations" }, 
plugin = {"pretty", "html:target/htmlreport.html"})



public class CucumberTestRunnerWithTags extends AbstractTestNGCucumberTests {

}

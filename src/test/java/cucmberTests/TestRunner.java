package cucmberTests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( format = {"pretty", "html:target/html/"},
        features = "./src/test/resources"
        ,glue={"stepDefinition"})
public class TestRunner {


}

package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Orders.feature", plugin = "json:target/jsonReports/cucumber-report.json",
glue = {"ordersCreated"})
public class TestRunner {

}
package testRuuner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/featureFiles"},
glue={"stepDefinations"},tags="@SmokeTest and @RegressionTest",
plugin={"pretty",
		"json:target/MyReports/reports.json",
		"junit:target/MyReports/report.xml",
		"html:targe/MyReports/cucumber.html"}
)	

public class TestNGRunner 
{

}


package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\neeth\\eclipse-workspace\\CucumberBDDFramework\\src\\test\\java\\Feature",
glue= {"stepDefinition"}, plugin={"pretty", "html:target/HTMLReports.html"},monochrome=true,
dryRun=false)
//dryRun to check feature file and step defenition are matched
public class TestRunner {
	
		
	}



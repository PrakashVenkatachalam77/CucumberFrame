package demoTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features="./src/test/resources/DemoFeature",glue="demoPackage",publish=false,plugin={"pretty","html:report/output.html"})

public class DemoRunner {
	
	

}

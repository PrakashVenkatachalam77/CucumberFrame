package cucumberClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions
(features="./src/test/resources/FeatureFile/multidata.feature",
glue="stepDefenition",
publish=true,
plugin= {"pretty","junit:May5/output.xml","html:May5/output1.html"})

public class TestRunnerClass {

}

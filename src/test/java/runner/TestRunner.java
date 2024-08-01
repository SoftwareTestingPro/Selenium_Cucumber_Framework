package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

@CucumberOptions(features = "src/test/resources/features",
        glue = {"com.qa.mystepdefs"},
        plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"},
        monochrome = true,
        publish = true)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
    
    @BeforeSuite
    public void BeforeSuite() {
    	System.out.println("************************ Execution Started ************************");
    }
    
    @AfterSuite
    public void AfterSuite() {
    	System.out.println("************************ Execution Completed ************************");
    }
}
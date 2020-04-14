package org.automation.test.runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.PickleEventWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import org.testng.annotations.*;

@CucumberOptions (
        features = "src/main/resources/features/"
        ,glue = {"org.automation.test.stepDefinition"}
        ,tags = {"@Testing"}, plugin = {"pretty",
        "html:target/site/cucumber-pretty"}
        , monochrome = true)
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    public static String browser;
    @BeforeClass(alwaysRun = true)
    public void setUpClass() throws Exception {
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }
    @Parameters("browser")
    @BeforeTest
    public void setBrowser(String browser){
        this.browser=browser;
    }


    @Test(dataProvider = "features")
    public void feature(PickleEventWrapper eventwrapper, CucumberFeatureWrapper cucumberFeature) throws Throwable {
        testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
        //testNGCucumberRunner.runScenario(eventwrapper.getPickleEvent());
    }

    @DataProvider//(parallel=true)
    public Object[][] features() {
        // return testNGCucumberRunner.provideFeatures();
        return testNGCucumberRunner.provideScenarios();
    }

    @AfterClass(alwaysRun = true)
    public void tearDownClass() throws Exception {
        testNGCucumberRunner.finish();
    }
}

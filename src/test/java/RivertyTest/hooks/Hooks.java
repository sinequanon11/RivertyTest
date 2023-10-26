package RivertyTest.hooks;

import RivertyTest.utilities.Driver;
import io.cucumber.java.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println( "Scenario started" );
    }

    @After
    public void tearDown(Scenario scenario) {
        System.out.println( "Scenario ended" );

        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs( OutputType.BYTES );
            scenario.attach( failedScreenshot, "image.png", "failed" + scenario.getName() );
        }
        Driver.quitDriver();
    }

}

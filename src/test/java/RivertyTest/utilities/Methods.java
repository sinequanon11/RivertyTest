package RivertyTest.utilities;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Methods {

    public static void clickJSElementWithJavaScript(String javascriptPath) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        WebElement webElement = (WebElement) jse.executeScript( "return " + javascriptPath + "" );
        jse.executeScript( "arguments[0].click();", webElement );
    }

    public static void switchToNewWindowAndAssertURL(String expectedURL) {
        String currentWindow = Driver.getDriver().getWindowHandle();
        for (String windowHandle : Driver.getDriver().getWindowHandles()) {
            if (!windowHandle.equals( currentWindow )) {
                Driver.getDriver().switchTo().window( windowHandle );
                break;
            }
        }
        Assert.assertEquals( expectedURL, Driver.getDriver().getCurrentUrl() );
    }

}

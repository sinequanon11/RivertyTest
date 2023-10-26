package RivertyTest.stepdefinitions;

import RivertyTest.utilities.ConfigurationReader;
import RivertyTest.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

public class Step_Home extends Step_Parent {

    @When("User goes to Riverty {string}")
    public void userGoesToRiverty(String string) {
        Driver.getDriver().get( ConfigurationReader.getProperty( "homepage" ) );
    }

    @Then("User accepts all cookies")
    public void userAcceptsAllCookies() {
        SearchContext shadow = Driver.getDriver().findElement( By.cssSelector( "#usercentrics-root" ) ).getShadowRoot();
        WebElement acceptAll = shadow.findElement( By.cssSelector( ".sc-dcJsrY.hBMKeI" ) );
        clickFunction( acceptAll );
    }

}

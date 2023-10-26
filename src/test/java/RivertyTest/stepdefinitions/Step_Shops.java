package RivertyTest.stepdefinitions;

import RivertyTest.pages.Page_Shops;
import RivertyTest.utilities.Driver;
import RivertyTest.utilities.Methods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Shops extends Step_Parent {

    Page_Shops shopsP = new Page_Shops();

    @When("User clicks Shops")
    public void userClicksShops()  {
        clickFunction( shopsP.shops );
    }

    @And("User clicks Autovermietung")
    public void userClicksAutovermietung() {
        Methods.clickJSElementWithJavaScript( "document.querySelector(\"#block-48105121 > section > div.filter-and-teasers.content.partner-cards-block-w-filter__main > div.partner-cards-block-w-filter__filter--lg > ul > li:nth-child(3) > a\")" );
    }

    @And("User clicks the result")
    public void userClicksTheResult() {
        Methods.clickJSElementWithJavaScript( "document.querySelector(\"#block-48105121 > section > div.filter-and-teasers.content.partner-cards-block-w-filter__main > div.insight-page-teaser.partner-page-teaser > div > div > div > a.insight-card__title-container > p\")" );
    }

    @Then("User asserts that a new window is opened")
    public void userAssertsThatANewWindowIsOpened() {
        Methods.switchToNewWindowAndAssertURL( "https://www.sixt.de/" );
        Driver.quitDriver();
    }
}

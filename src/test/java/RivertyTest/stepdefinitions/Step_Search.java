package RivertyTest.stepdefinitions;

import RivertyTest.pages.Page_Search;
import RivertyTest.utilities.Driver;
import RivertyTest.utilities.ExcelUtils;
import RivertyTest.utilities.Methods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class Step_Search extends Step_Parent{

    Page_Search searchP = new Page_Search();
    Actions actions = new Actions( Driver.getDriver() );

    @When("User clicks the Search button")
    public void userClicksTheSearchButton()  {
        clickFunction( searchP.searchButton );
    }

    @And("User enters an {string} in the Search bar and searches")
    public void userEntersAnInTheSearchBarAndSearches(String string) {
        Methods.clickJSElementWithJavaScript( "document.querySelector(\"body > main > section.search-page__input > form > input\")" );
        sendKeysFunction( searchP.searchInput, string );
        actions.sendKeys( Keys.ENTER ).perform();
    }

    @Then("User sees a message saying that there is no result for this search")
    public void user_sees_a_message_saying_that_there_is_no_result_for_this_search() {
        String message = "Es wurden keine Ergebnisse für deine Anfrage gefunden.";
        Assert.assertTrue( searchP.resultNotFound.getText().contains( message ) );
        Driver.quitDriver();
    }

    @Then("User sees the results for this search")
    public void userSeesTheResultsForThisSearch() {
        Assert.assertTrue( searchP.searchResults.getText().contains( "Wir sind hier" ) );
        Driver.quitDriver();
    }

    @And("User enters an item from {string} sheet of the Excel file and searches")
    public void userEntersAnItemFromSheetOfTheExcelFileAndSearches(String sheetname) {
        ExcelUtils excelUtils = new ExcelUtils( "src/test/resources/RivertySearch.xlsx", sheetname );
        String searchItem = excelUtils.getCellData( 1,1 );
        Methods.clickJSElementWithJavaScript( "document.querySelector(\"body > main > section.search-page__input > form > input\")" );
        sendKeysFunction( searchP.searchInput, searchItem );
        actions.sendKeys( Keys.ENTER ).perform();
    }

}

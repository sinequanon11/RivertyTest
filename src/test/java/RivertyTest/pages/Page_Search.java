package RivertyTest.pages;

import RivertyTest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Search {

    public Page_Search() { PageFactory.initElements( Driver.getDriver(),this );  }

    @FindBy(css = "a[class='nav-search'] img[alt='search']")
    public WebElement searchButton;

    @FindBy(css = "input[placeholder='Wonach suchst du?']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[@class='search-page__not-found-message']")
    public WebElement resultNotFound;

    @FindBy(css = ".search-page__title")
    public WebElement searchResults;



}

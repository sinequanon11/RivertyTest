package RivertyTest.pages;

import RivertyTest.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page_Shops {

    public Page_Shops() { PageFactory.initElements( Driver.getDriver(),this );  }

    @FindBy(xpath = "//a[contains(text(),'Shops')]")
    public WebElement shops;

}

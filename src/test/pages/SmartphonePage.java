package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartphonePage {
    WebDriver driver;

    public SmartphonePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//span[normalize-space()='Model Year']")
    public WebElement labelModelYear;

    @FindBy(css="label[for='apb-browse-refinements-checkbox_67'] i[class='a-icon a-icon-checkbox']")
    public WebElement modelYearOption;

    @FindBy(xpath="//span[normalize-space()='1-24 of 104 results']")
    public WebElement deviceListCount;

}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PhoneAndAccessoriesPage {

    WebDriver driver;

    public PhoneAndAccessoriesPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[normalize-space()='Mobile Phones & Smartphones']")
    public WebElement linkMobileAndSmartphone;
}

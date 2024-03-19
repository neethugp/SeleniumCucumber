package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

    WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//a[@id='nav-hamburger-menu']")
    public WebElement hamburgerMenu;

    @FindBy(css=".a-size-medium-plus.a-color-base.a-text-bold")
    public WebElement textResult;

    @FindBy(xpath="//div[normalize-space()='Electronics & Computers']")
    public WebElement textElectronicsComputers;

    @FindBy(xpath="//a[contains(text(),'Phones & Accessories')]")
    public WebElement textPhoneAndAccessories;

    @FindBy(linkText = "Try different image")
    public WebElement linkTryDifferentImage;

    @FindBy(xpath = "//span[@class='a-button a-button-primary']")
    public WebElement acceptBtn;



}

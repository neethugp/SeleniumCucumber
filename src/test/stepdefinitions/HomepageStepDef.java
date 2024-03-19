package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageaction.HomepageAction;

public class HomepageStepDef {

    WebDriver driver = DriverFactory.getDriver();

    HomepageAction homepageAction = new HomepageAction();

    @Given("^User is on Amazon Homepage$")
    public void user_is_on_Amazon_Homepage() {
        homepageAction.isHamburgerMenuDisplayed();
    }

    @And("^User clicks on hamburger$")
    public void user_clicks_on_hamburger()  {
        homepageAction.clickHamburgerMenu();
    }

    @And("^User clicks on Electronics and Computers$")
    public void user_clicks_on() {
        homepageAction.clickOnElectronicsAndComputers();
    }

    @And("^User clicks on Phone and Accessories$")
    public void user_clicks_on_Phone_and_Accessories()  {
        homepageAction.clickOnPhoneAndAccessories();
    }

}

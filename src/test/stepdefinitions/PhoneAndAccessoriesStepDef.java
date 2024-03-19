package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageaction.PhoneAndAccessoriesAction;

public class PhoneAndAccessoriesStepDef {
    WebDriver driver = DriverFactory.getDriver();
    PhoneAndAccessoriesAction phoneAndAccess = new PhoneAndAccessoriesAction();

    @And("^User clicks on Mobile Phones and Smartphones$")
    public void user_clicks_on_Mobile_Phones_Smartphones()  {
        phoneAndAccess.clickOnLinkMobilePhone();
    }
    @And("^User will click on Mobile Phones and Smartphones$")
    public void user_will_click_on_Mobile_Phones_Smartphones()  {
        phoneAndAccess.clickOnLink();
    }

}

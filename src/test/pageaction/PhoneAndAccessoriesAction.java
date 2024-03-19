package pageaction;

import factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.PhoneAndAccessoriesPage;
import utils.ReusableMethods;

public class PhoneAndAccessoriesAction {

    WebDriver driver = DriverFactory.getDriver();
    ReusableMethods common = new ReusableMethods(driver);
    PhoneAndAccessoriesPage phoneAndAccessories = new PhoneAndAccessoriesPage(driver);

    public void clickOnLinkMobilePhone() {
        common.isElementDisplayed(phoneAndAccessories.linkMobileAndSmartphone);
        phoneAndAccessories.linkMobileAndSmartphone.click();
        System.out.println("Mobile and Smartphone link clicked");
    }

    public void clickOnLink() {
        common.isElementDisplayed(phoneAndAccessories.linkMobileAndSmartphone);
        Assert.assertEquals(phoneAndAccessories.linkMobileAndSmartphone.getText(), "Mobile Phones and Smartphones");
        System.out.println("Mobile and Smartphone link clicked");
    }


}

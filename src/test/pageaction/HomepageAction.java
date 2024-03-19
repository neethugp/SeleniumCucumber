package pageaction;

import factory.DriverFactory;
import org.openqa.selenium.*;
import pages.Homepage;
import utils.ReusableMethods;

public class HomepageAction {

    WebDriver driver = DriverFactory.getDriver();
    ReusableMethods common = new ReusableMethods(driver);
    Homepage homepage = new Homepage(driver);


    public void clickHamburgerMenu() {
        try {
            common.isElementDisplayed(homepage.hamburgerMenu);
            common.clickElement(homepage.hamburgerMenu);
            System.out.println("Hamburger Menu is displayed and clicked");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void isHamburgerMenuDisplayed() {
        try {
            common.isElementDisplayed(homepage.hamburgerMenu);
            System.out.println("Hamburger Menu is displayed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clickOnElectronicsAndComputers() {
        try {
            common.scrollAndClickElement(homepage.textElectronicsComputers);
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("Element not displayed: " + e.getMessage());
        }
    }

    public void clickOnPhoneAndAccessories() {
            common.moveToElement(homepage.textPhoneAndAccessories);
    }

//    public void clickOnLinkMobilePhone() {
//        common.isElementDisplayed(homepage.linkMobileAndSmartphone);
//        homepage.linkMobileAndSmartphone.click();
//        System.out.println("Mobile and Smartphone link clicked");
//    }

//    public void selectDesiredSpec() {
//        try {
//            WebElement eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
//            WebElement stale1 = driver.findElement(By.cssSelector("label[for='apb-browse-refinements-checkbox_134'] i[class='a-icon a-icon-checkbox']"));
////                    driver.findElement(By.xpath("//label[@for='apb-browse-refinements-checkbox_134']//i[@class='a-icon a-icon-checkbox']"));
//
//            common.scrollAndClickElement(homepage.labelModelYear);
//            common.moveToElement(homepage.modelYearOption);
//
//            System.out.println("First option selected");
//
//
//            eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
//            common.scrollAndClickElement(eleStale);
//
//            WebElement stale2 = driver.findElement(By.xpath("//li[@id='p_n_feature_four_browse-bin/14210450031']//i[@class='a-icon a-icon-checkbox']"));
//            common.moveToElement(stale2);
//
//            WebElement stale3 = driver.findElement(By.xpath("//span[normalize-space()='Price']"));
//            common.scrollAndClickElement(stale3);
//
//            WebElement stale4 = driver.findElement(By.xpath("//span[contains(text(),'£100 to £200')]"));
//            common.moveToElement(stale4);
//        } catch(Exception e){
//            e.printStackTrace();
//        }
//    }

//    public void devicesCount() {
//        try {
//            String resultText = driver.findElement(By.xpath("//span[normalize-space()='1-24 of 105 results']")).getText();
//            System.out.println("Text = "+ resultText);
//            Assert.assertEquals(resultText, "1-24 of 105 results");
//    }catch(Exception e) {
//            e.printStackTrace();
//    }
//}


}

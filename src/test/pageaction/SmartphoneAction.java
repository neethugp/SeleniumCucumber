package pageaction;

import factory.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SmartphonePage;
import utils.ReusableMethods;

public class SmartphoneAction {

    WebDriver driver = DriverFactory.getDriver();
    ReusableMethods common = new ReusableMethods(driver);

    SmartphonePage smartphonePage = new SmartphonePage(driver);

    public void selectDesiredSpec() {
        try {
            WebElement eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
            WebElement stale1 = driver.findElement(By.cssSelector("label[for='apb-browse-refinements-checkbox_134'] i[class='a-icon a-icon-checkbox']"));
//                    driver.findElement(By.xpath("//label[@for='apb-browse-refinements-checkbox_134']//i[@class='a-icon a-icon-checkbox']"));

            common.scrollAndClickElement(smartphonePage.labelModelYear);
            common.moveToElement(smartphonePage.modelYearOption);

            System.out.println("First option selected");

            eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
            common.scrollAndClickElement(eleStale);

            WebElement stale2 = driver.findElement(By.xpath("//li[@id='p_n_feature_four_browse-bin/14210450031']//i[@class='a-icon a-icon-checkbox']"));
            common.moveToElement(stale2);

            System.out.println("Second option selected");

            WebElement stale3 = driver.findElement(By.xpath("//span[normalize-space()='Price']"));
            common.scrollAndClickElement(stale3);

            WebElement stale4 = driver.findElement(By.xpath("//span[contains(text(),'£100 to £200')]"));
            common.moveToElement(stale4);
        } catch(Exception e){
            e.printStackTrace();
        }
    }


    public void selectUnDesiredSpec() {
        try {
            WebElement eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
            WebElement stale1 = driver.findElement(By.cssSelector("label[for='apb-browse-refinements-checkbox_134'] i[class='a-icon a-icon-checkbox']"));

            common.scrollAndClickElement(smartphonePage.labelModelYear);
            common.moveToElement(smartphonePage.modelYearOption);

            System.out.println("First option selected");


            eleStale = driver.findElement(By.xpath("//span[normalize-space()='Camera Resolution']"));
            common.scrollAndClickElement(eleStale);

            WebElement stale2 = driver.findElement(By.xpath("//li[@id='p_n_feature_four_browse-bin/14210450031']//i[@class='a-icon a-icon-checkbox']"));
            common.moveToElement(stale2);

            System.out.println("Second option selected");

            WebElement stale3 = driver.findElement(By.xpath("//span[normalize-space()='Price']"));
            common.scrollAndClickElement(stale3);

            WebElement stale4 = driver.findElement(By.xpath("//span[contains(text(),'£15 to £50')]"));
            common.moveToElement(stale4);
            Assert.assertEquals(stale4.getText(), "£15 to £50");

            System.out.println("Third option selected");

        } catch(Exception e){
            e.printStackTrace();
        }
    }
    public void devicesCount() {
        try {
            String resultText = smartphonePage.deviceListCount.getText();
            System.out.println("Text = "+ resultText);
            Assert.assertEquals(resultText, "1-24 of 104 results");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}

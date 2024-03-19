package hooks;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import pages.Homepage;
import utils.ReadPropertyFile;
import utils.ReusableMethods;
import java.time.Duration;
import java.util.Properties;


public class Hooks {
    WebDriver driver;
    Homepage homepage = new Homepage(driver);
    ReusableMethods common = new ReusableMethods(driver);

    @Before
    public void setup() throws Exception {
        Properties prop=ReadPropertyFile.initializeProperties();
        DriverFactory.initializeBrowser(prop.getProperty("browser"));
        driver = DriverFactory.getDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        driver.get(prop.getProperty("url"));
        driver.findElement(By.linkText("Try different image")).click();
        WebElement ele = driver.findElement(By.xpath("//span[@class='a-button a-button-primary']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(ele));
        ele.click();
    }

    @AfterTest
    public void addScreenshot(Scenario scenario){

        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "image");

    }



    @After
    public void tearDown(){

        driver.quit();
    }
}

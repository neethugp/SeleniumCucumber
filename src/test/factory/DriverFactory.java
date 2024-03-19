package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;

public class DriverFactory {
    static WebDriver driver = null;

    public static void initializeBrowser(String browserName){

        if(browserName.equalsIgnoreCase("Chrome")){
            System.out.println("Browser launched");
            driver = new ChromeDriver();
        } else if(browserName.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        } else if(browserName.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();
        }
    }

    public static WebDriver getDriver(){

        return driver;
    }



}

package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReusableMethods {

    WebDriver driver;

    public ReusableMethods(WebDriver driver){
        this.driver = driver;
    }

    // WebDriver Wait for element visibility
    public void isElementDisplayed(WebElement element) {
        try {
            if (element != null) {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                WebElement ele = wait.until(ExpectedConditions.visibilityOf(element));
            } else {
                System.out.println("WebDriverWait--Element passed is NULL");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //To click an element
    public void clickElement(WebElement ele){
        try{
            ele.click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //Check element is displayed
    public void eleDisplayed(WebElement ele) {
        try {
            if (ele != null) {
                ele.isDisplayed();
                System.out.println("Element is displayed");
            } else {
                System.out.println("Element is not displayed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Scroll and click the element
    public void scrollAndClickElement(WebElement ele) {
        try {
            if (ele != null) {
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
                ele.click();
                System.out.println("Scrolled element is clicked");
            } else {
                System.out.println("Element passed to scroll and click is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(WebElement ele) {
        try {
            Actions action = new Actions(driver);
            action.moveToElement(ele).click().build().perform();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

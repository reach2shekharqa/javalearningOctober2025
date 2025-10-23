package com.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    WebDriverWait wait;

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void testLogin() {

        driver.get("https://www.redbus.in/");

        WebElement fromTextBox = driver
                .findElement(By.cssSelector("div[class^='inputAndSwapWrapper']>div[class^='srcDest'][role='button']"));

        jsClick(fromTextBox);

        type("#srcDest", "Chennai");

        driver.quit();

    }

    public void click(String locator) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(locator))).click();

    }

    public void type(String locator, String text) {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(locator)))
                .sendKeys(text);
                 try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }

    }

    public void jsClick(WebElement element) {

        js.executeScript("arguments[0].click();", element);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {

            e.printStackTrace();
        }
    }

    @AfterMethod

    public void exitALL() {
        driver.quit();
    }

}

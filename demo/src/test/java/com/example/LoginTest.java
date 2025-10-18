package com.example;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

   @Test
   public void first(){

     WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.redbus.in/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.quit();
   }
}

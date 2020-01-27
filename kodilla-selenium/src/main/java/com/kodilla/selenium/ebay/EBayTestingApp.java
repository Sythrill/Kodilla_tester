package com.kodilla.selenium.ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBayTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");
        WebElement element = driver.findElement(By.name("_nkw"));
        element.sendKeys("Laptop");
        element.submit();
    }
}

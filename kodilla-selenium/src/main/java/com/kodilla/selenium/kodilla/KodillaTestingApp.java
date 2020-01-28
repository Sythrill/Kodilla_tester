package com.kodilla.selenium.kodilla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class KodillaTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://kodilla.com/pl/sign-in");
        WebElement email = driver.findElement(By.xpath("//html/body/div/div/form/fieldset/input"));
        email.sendKeys("testuser@gmail.com");
        WebElement password = driver.findElement(By.xpath("//html/body/div/div/form/fieldset[2]/input"));
        password.sendKeys("Haslo");
        WebElement button = driver.findElement(By.xpath("//html/body/div/div/form/div[2]/button"));
        button.submit();
    }
}

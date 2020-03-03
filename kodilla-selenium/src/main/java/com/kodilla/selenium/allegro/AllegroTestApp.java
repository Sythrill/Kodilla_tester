package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl");
        driver.findElement(By.xpath("//button[@class='_13q9y _8hkto _nu6wg _1sql3 _qdoeh _l7nkx _nyhhx']")).click();

        WebElement inputElement = driver.findElement(
                By.xpath("//*[contains(@class, 'fee54')]/div/div/div/div/form/input"));
        inputElement.sendKeys("Mavic mini");

        WebElement selectList = driver.findElement(By.xpath(
                "//select[@class='_d25db_2P-5I _1h7wt _k70df _7qjq4']"));

        Select selectCategory = new Select(selectList);
        selectCategory.selectByIndex(3);

        driver.findElement(By.xpath("//button[@class='_d25db_1t06j _13q9y _8tsq7 _1q2ua']")).click();
        driver.close();
    }
}

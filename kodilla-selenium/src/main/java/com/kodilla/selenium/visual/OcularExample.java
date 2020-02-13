package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;


public class OcularExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "E:\\SeleniumDrivers\\Chrome\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        WorldTimePage page = new WorldTimePage(webDriver);

        Ocular.config()
                .resultPath(Paths.get("E:\\result"))
                .snapshotPath(Paths.get("E:\\snapshot"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        page.open();
        page.close();
        page.compare();

    }
}

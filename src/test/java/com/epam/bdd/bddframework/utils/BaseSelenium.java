package com.epam.bdd.bddframework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseSelenium {
    public static WebDriver driver;

    public static void init() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void close() {
        try {
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver = null;
        }
    }
}

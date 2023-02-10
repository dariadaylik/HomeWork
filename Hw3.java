package org.example.hw3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class TestHw3 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.21vek.by/");

        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div/button[2]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.className("userToolsText"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.className("Button-module__buttonText"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.id("login-email"));
        webElement4.click();
        webElement4.sendKeys("prusakovadp@yandex.ru");

        WebElement webElement5 = driver.findElement(By.id("login-password"));
        webElement5.click();
        webElement5.sendKeys("128bdcbd");

        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/button"));
        webElement6.click();







    }
}





package org.example.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class MyTest {

    static WebDriver driver;

    @BeforeAll
    static void init(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    void getPage(){
        driver.get("https://www.21vek.by/");
    }

    @Test
    void test() throws InterruptedException {
        WebElement webElement1 = driver.findElement(By.xpath("//*[@id=\"modal-cookie\"]/div/div[2]/div/button[2]"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.className("userToolsText"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//*[@id=\"userToolsDropDown\"]/div/div[1]/div[2]/button/div/span"));
        webElement3.click();

        WebElement webElement4 = driver.findElement(By.id("login-email"));
        webElement4.click();
        webElement4.sendKeys("prusakovadp@yandex.ru");

        WebElement webElement5 = driver.findElement(By.id("login-password"));
        webElement5.click();
        webElement5.sendKeys("128bdcbd");

        WebElement webElement6 = driver.findElement(By.xpath("//*[@id=\"modal\"]/div/div/div[2]/div/div/form/div/div[2]/div[3]/button/div"));
        webElement6.click();

        Assertions.assertEquals("Онлайн-гипермаркет 21vek.by",driver.getTitle(),"Не та страница");


    }

    @AfterAll
    static void close(){
        driver.quit();


    }


}

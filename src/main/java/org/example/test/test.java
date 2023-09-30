package org.example.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class test {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Paul R\\Documents\\IntelliJ IDEA\\DemoSelenium\\src\\main\\resources\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/v1/");

        driver.manage().window().maximize();

        String Username= "standard_user";
        String password = "secret_sauce";


        WebElement usernameImput = driver.findElement(By.id("user-name"));
        WebElement passwordImput = driver.findElement(By.id("password"));

        WebElement Button = driver.findElement(By.id("login-button"));

        usernameImput.sendKeys(Username);
        passwordImput.sendKeys(password);

        Button.click();
    }
}

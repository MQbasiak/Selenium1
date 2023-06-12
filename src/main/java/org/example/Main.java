package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mimo8\\OneDrive\\Pulpit\\Repozytoria\\Selenium1\\Chromedriver\\chromedriver.exe");
        ChromeOptions  options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver webDriver = new ChromeDriver(options);
        webDriver.get("https://www.w3schools.com/xml/xpath_syntax.asp");
        //*[@id="accept-choices"]
        webDriver.findElement(By.xpath("//*[@id=\"accept-choices\"]")).click();

    }
}
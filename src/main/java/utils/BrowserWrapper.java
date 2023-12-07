package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWrapper {

    private final WebDriver chromeDriver = new ChromeDriver();

    public WebDriver getChromeDriver(){
        return chromeDriver;
    }
}

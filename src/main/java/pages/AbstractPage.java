package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public abstract class AbstractPage {

    public WebElement getElement(BrowserWrapper browserWrapper, String xpath) {
        return browserWrapper.getChromeDriver().findElement(By.xpath(xpath));
    }

    public void clickButton(BrowserWrapper browserWrapper, String xpath) {
        getElement(browserWrapper, xpath).click();
    }

    public void sendKeys(BrowserWrapper browserWrapper, String xpath, String text) {
        getElement(browserWrapper, xpath).sendKeys(text);
    }

}


package utils.actions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class ScrollPage {
    public static void scrollPage(WebElement webElement) {
        webElement.sendKeys(Keys.DOWN);
    }
}

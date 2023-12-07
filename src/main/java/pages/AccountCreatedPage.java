package pages;

import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public class AccountCreatedPage extends AbstractPage {
    private String accountCreatedLabel = "//b[text()='Account Created!']";
    private String continueButton = "//a[@class='btn btn-primary']";

    public WebElement getElementAccountCreatedLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, accountCreatedLabel);
    }

    public void clickOnContinueButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, continueButton);
    }
}

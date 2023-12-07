package pages;

import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public class DeleteAccountPage extends AbstractPage {
    private String accountDeletedLabel = "//h2[@class='title text-center']";
    private String continueButton = "//a[@class='btn btn-primary']";

    public WebElement getElementAccountDeletedLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, accountDeletedLabel);
    }

    public void clickOnContinueButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, continueButton);
    }
}

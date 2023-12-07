package pages;

import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public class LoginPage extends AbstractPage {
    private String newUserSignupLabel = ".//h2[text()='New User Signup!']";
    private String newUserSignupName = "//form[@action='/signup']//input[@type='text']";
    private String newUserSignupEmail = "//form[@action='/signup']//input[@type='email']";
    private String signupButton = "//button[@data-qa='signup-button']";
    private String loginToYourAccountLabel = "//h2[text()='Login to your account']";
    private String loginEmail = "//input[@type='email' and @data-qa='login-email']";
    private String loginPassword = "//input[@type='password' and @data-qa='login-password']";
    private String loginButton = "//button[@data-qa='login-button']";
    private String yourEmailOrPasswordIsIncorrectLabel = "//p[text()='Your email or password is incorrect!']";

    public WebElement getElementNewUserSignupLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, newUserSignupLabel);
    }

    public void sendKeysToNewUserSignupName(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, newUserSignupName, text);
    }

    public void sendKeysToNewUserSignupEmail(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, newUserSignupEmail, text);
    }

    public void clickOnSignupButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, signupButton);
    }

    public WebElement getElementLoginToYourAccountLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, loginToYourAccountLabel);
    }

    public void sendKeysToLoginEmail(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, loginEmail, text);
    }

    public void sendKeysToLoginPassword(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, loginPassword, text);
    }

    public void clickOnLoginButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, loginButton);
    }

    public WebElement getElementYourEmailOrPasswordIsIncorrectLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, yourEmailOrPasswordIsIncorrectLabel);
    }
}

package pages;

import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public class MainPage extends AbstractPage {

    private String mainSlider = ".//section[@id='slider']";
    private String SignupLoginButton = ".//a[@href='/login']";
    private String loggedInAsUsername = "//i[@class='fa fa-user']//..";
    private String deleteAccountButton = "//a//i[@class='fa fa-trash-o']";
    private String logoutButton = "//i[@class='fa fa-lock']";

    public void clickOnDeleteAccountButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper,deleteAccountButton);
    }

    public void clickOnSignupLoginButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper,SignupLoginButton);
    }

    public WebElement getMainSlider(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, mainSlider);
    }

    public WebElement getLoggedInAsUsername(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper,loggedInAsUsername);
    }

    public void clickOnLogoutButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, this.logoutButton);
    }
}

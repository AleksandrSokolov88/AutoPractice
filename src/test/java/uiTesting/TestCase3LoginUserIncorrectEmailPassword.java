package uiTesting;

import io.qameta.allure.Step;
import model.GeneratedUser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.MainPage;
import utils.BrowserWrapper;
import utils.actions.NavigateToUrl;
import verification.Verify;

public class TestCase3LoginUserIncorrectEmailPassword {
    static BrowserWrapper browserWrapper = new BrowserWrapper();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    GeneratedUser generatedUser = new GeneratedUser(true, true);


    @Test
    public void TestCase3LoginUserIncorrectEmailPasswordFlow() {
        navigateToUrl();
        verifyHomePageIsVisible();
        clickOnSignupLoginButton();
        verifyLoginToYourAccountIsVisible();
        enterIncorrectEmailAddressAndPassword();
        clickLoginButton();
        verifyErrorYourEmailOrPasswordIsIncorrectIsVisible();

    }

    @Step("2. Navigate to url http://automationexercise.com")
    public void navigateToUrl() {
        NavigateToUrl.navigateToUrl(browserWrapper);
    }

    @Step("3. Verify that home page is visible successfully")
    public void verifyHomePageIsVisible() {
        Verify.verifyThatHomePageIsVisible(browserWrapper, mainPage);
    }

    @Step("4. Click on 'Signup / Login' button")
    public void clickOnSignupLoginButton() {
        mainPage.clickOnSignupLoginButton(browserWrapper);
    }

    @Step("5. Verify 'Login to your account' is visible")
    public void verifyLoginToYourAccountIsVisible() {
        Verify.verifyThatLoginToYourAccountIsVisible(browserWrapper, loginPage);
    }

    @Step("6. Enter incorrect email address and password")
    public void enterIncorrectEmailAddressAndPassword() {
        loginPage.sendKeysToLoginEmail(browserWrapper, generatedUser.getEmail());
        loginPage.sendKeysToLoginPassword(browserWrapper, generatedUser.getPassword());
    }

    @Step("7. Click 'login' button")
    public void clickLoginButton() {
        loginPage.clickOnLoginButton(browserWrapper);
    }

    @Step("8. Verify error 'Your email or password is incorrect!' is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assertions.assertTrue(loginPage.getElementYourEmailOrPasswordIsIncorrectLabel(browserWrapper).isDisplayed());
    }

    @AfterAll
    public static void afterTest() {
        browserWrapper.getChromeDriver().quit();
    }

}

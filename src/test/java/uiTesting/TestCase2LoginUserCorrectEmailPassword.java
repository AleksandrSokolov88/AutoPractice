package uiTesting;

import verification.Verify;
import pages.*;
import utils.actions.NavigateToUrl;
import io.qameta.allure.Step;
import org.junit.jupiter.api.*;
import utils.BrowserWrapper;
import model.GeneratedUser;
import logic.RegisterUser;

import java.io.IOException;

public class TestCase2LoginUserCorrectEmailPassword {
    static BrowserWrapper browserWrapper = new BrowserWrapper();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
    GeneratedUser generatedUser = new GeneratedUser(true, true);
    RegisterUser registerUser = new RegisterUser();

    @Test
    public void TestCase2LoginUserCorrectEmailPasswordFlow() throws IOException {
        //create new user - precondition.
        registerUser.registerUserFlow(browserWrapper, loginPage, signupPage, generatedUser, accountCreatedPage, mainPage);
        //test flow
        navigateToUrl();
        verifyHomePageIsVisible();
        clickOnSignupLoginButton();
        verifyLoginToYourAccountIsVisible();
        enterCorrectEmailAndPassword();
        clickLoginButton();
        verifyThatLoggedInAsUsernameIsVisible();
        clickDeleteAccountButton();
        verifyAccountDeletedIsVisible();
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
      Verify.verifyThatLoginToYourAccountIsVisible(browserWrapper,loginPage);
    }

    @Step("6. Enter correct email address and password")
    public void enterCorrectEmailAndPassword() {
        loginPage.sendKeysToLoginEmail(browserWrapper, generatedUser.getEmail());
        loginPage.sendKeysToLoginPassword(browserWrapper, generatedUser.getPassword());

    }

    @Step("7. Click 'login' button")
    public void clickLoginButton() {
        loginPage.clickOnLoginButton(browserWrapper);
    }

    @Step("8. Verify that 'Logged in as username' is visible")
    public void verifyThatLoggedInAsUsernameIsVisible() {
        Verify.verifyThatLoggedInAsUsernameIsVisible(browserWrapper, mainPage);
    }

    @Step("9. Click 'Delete Account' button")
    public void clickDeleteAccountButton() {
        mainPage.clickOnDeleteAccountButton(browserWrapper);
    }

    @Step("10. Verify that 'ACCOUNT DELETED!' is visible")
    public void verifyAccountDeletedIsVisible() {
        Verify.verifyThatAccountDeletedLabelIsVisible(browserWrapper, deleteAccountPage);
    }

    @AfterAll
    public static void afterTest() {
        browserWrapper.getChromeDriver().quit();
    }
}

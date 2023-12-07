import io.qameta.allure.Step;
import logic.RegisterUser;
import model.GeneratedUser;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.MainPage;
import pages.SignupPage;
import utils.BrowserWrapper;
import utils.actions.NavigateToUrl;
import verification.Verify;

import java.io.IOException;

public class TestCase4LogoutUser {
    static BrowserWrapper browserWrapper = new BrowserWrapper();
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    GeneratedUser generatedUser = new GeneratedUser(true, true);
    RegisterUser registerUser = new RegisterUser();
    SignupPage signupPage = new SignupPage();
    AccountCreatedPage accountCreatedPage = new AccountCreatedPage();


    @Test
    public void testCase4LogoutUserFlow() throws IOException {
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
        clickLogoutButton();
        verifyThatUserIsNavigatedToLoginPage();
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

    @Step("9. Click 'Logout' button")
    public void clickLogoutButton() {
        registerUser.clickOnLogoutButton(browserWrapper, mainPage);
    }

    @Step("10. Verify that user is navigated to login page")
    public void verifyThatUserIsNavigatedToLoginPage() {
        Verify.verifyThatLoginToYourAccountIsVisible(browserWrapper, loginPage);
        Verify.verifyThatNewUserSignupIsVisible(browserWrapper, loginPage);
    }

    @AfterAll
    public static void afterTest() {
        browserWrapper.getChromeDriver().quit();
    }
}

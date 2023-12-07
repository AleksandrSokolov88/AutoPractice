import verification.Verify;
import logic.RegisterUser;
import utils.actions.NavigateToUrl;
import org.junit.jupiter.api.AfterAll;
import pages.*;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserWrapper;
import model.GeneratedUser;

import java.io.IOException;

public class TestCase1RegisterUser {
    private static BrowserWrapper browserWrapper = new BrowserWrapper();
    private GeneratedUser generatedUser = new GeneratedUser(true, true);
    private MainPage mainPage = new MainPage();
    private LoginPage loginPage = new LoginPage();
    private SignupPage signupPage = new SignupPage();
    private AccountCreatedPage accountCreatedPage = new AccountCreatedPage();
    private DeleteAccountPage deleteAccountPage = new DeleteAccountPage();
    private RegisterUser registerUser = new RegisterUser();


    // xpath for ads   #dismiss-button
    @Test
    public void TestCase1RegisterUserFlow() throws IOException {
        navigateToUrl();
        verifyHomePageIsVisible();
        clickOnSignupButton();
        verifyNewUserSignupIsVisible();
        enterNameAndEmail();
        clickSignupButton();
        enterAccountInformationIsVisible();
        fillDetailsAccountInf();
        scrollPage();
        selectSighupForOurNewsletter();
        selectReceiveSpecialOffers();
        fillDetailsAddressInf();
        clickCreateAccountButton();
        verifyThatAccountCreatedIsVisible();
        clickContinueButton();
        verifyThatLoggedInAsUsernameIsVisible();
        clickDeleteAccountButton();
        verifyAccountDeletedIsVisibleClickContinueButton();
    }

    @Step("2. Navigate to url http://automationexercise.com")
    private void navigateToUrl() {
        NavigateToUrl.navigateToUrl(browserWrapper);
    }

    @Step("3. Verify that home page is visible successfully")
    private void verifyHomePageIsVisible() {
        Verify.verifyThatHomePageIsVisible(browserWrapper, mainPage);
    }

    @Step("4. Click on 'Signup / Login' button")
    private void clickOnSignupButton() {
        mainPage.clickOnSignupLoginButton(browserWrapper);
    }

    @Step("5. Verify 'New User Signup!' is visible")
    private void verifyNewUserSignupIsVisible() {
        Verify.verifyThatNewUserSignupIsVisible(browserWrapper, loginPage);

    }

    @Step("6. Enter name and email address")
    private void enterNameAndEmail() throws IOException {
        registerUser.enterNameAndEmail(browserWrapper, loginPage, generatedUser);
    }

    @Step("7. Click 'Signup' button")
    private void clickSignupButton() {
        registerUser.clickOnSignupButton(browserWrapper, loginPage);
    }

    @Step("8.Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    private void enterAccountInformationIsVisible() {
        Assertions.assertTrue(signupPage.getAccountInformationLabel(browserWrapper).isDisplayed());
    }

    @Step("9. Fill details: Title, Name, Email, Password, Date of birth")
    private void fillDetailsAccountInf() {
        registerUser.fillDetailsAccountInf(browserWrapper, signupPage, generatedUser);
    }

    @Step("10. Select checkbox 'Sign up for our newsletter!'")
    private void selectSighupForOurNewsletter() {
        registerUser.selectSighupForOurNewsletter(browserWrapper, signupPage, generatedUser);
    }

    private void scrollPage() {
        registerUser.scrollPage(browserWrapper, signupPage);
    }

    @Step("11. Select checkbox 'Receive special offers from our partners!'")
    private void selectReceiveSpecialOffers() {
        registerUser.selectReceiveSpecialOffers(browserWrapper, signupPage, generatedUser);
    }

    @Step("12. Fill details: First name, Last name, " +
            "Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    private void fillDetailsAddressInf() {
        registerUser.fillDetailsAddressInf(browserWrapper, signupPage, generatedUser);
    }

    @Step("13. Click 'Create Account button'")
    private void clickCreateAccountButton() {

        registerUser.clickOnCreateAccountButton(browserWrapper, signupPage);
    }

    @Step("14. Verify that 'ACCOUNT CREATED!' is visible")
    private void verifyThatAccountCreatedIsVisible() {
        Verify.verifyThatAccountCreatedIsVisible(browserWrapper, accountCreatedPage);

    }

    @Step("15. Click 'Continue' button")
    private void clickContinueButton() {
        registerUser.clickOnContinueButton(browserWrapper, accountCreatedPage);
    }

    @Step("16. Verify that 'Logged in as username' is visible")
    private void verifyThatLoggedInAsUsernameIsVisible() {
        Verify.verifyThatLoggedInAsUsernameIsVisible(browserWrapper, mainPage);
    }

    @Step("17. Click 'Delete Account' button")
    private void clickDeleteAccountButton() {
        mainPage.clickOnDeleteAccountButton(browserWrapper);

    }

    @Step("18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button")
    private void verifyAccountDeletedIsVisibleClickContinueButton() {
        Verify.verifyThatAccountDeletedLabelIsVisible(browserWrapper, deleteAccountPage);
        deleteAccountPage.clickOnContinueButton(browserWrapper);
    }

    @AfterAll
    public static void afterTest() {
        browserWrapper.getChromeDriver().quit();
    }

}


package verification;

import org.junit.jupiter.api.Assertions;
import pages.AccountCreatedPage;
import pages.DeleteAccountPage;
import pages.LoginPage;
import pages.MainPage;
import utils.BrowserWrapper;

public class Verify {
    public static void verifyThatAccountDeletedLabelIsVisible(BrowserWrapper browserWrapper, DeleteAccountPage deleteAccountPage) {
        Assertions.assertTrue(deleteAccountPage.getElementAccountDeletedLabel(browserWrapper).isDisplayed());

    }

    public static void verifyThatHomePageIsVisible(BrowserWrapper browserWrapper, MainPage mainPage) {
        Assertions.assertTrue(mainPage.getMainSlider(browserWrapper).isDisplayed());
    }

    public static void verifyThatLoggedInAsUsernameIsVisible(BrowserWrapper browserWrapper, MainPage mainPage) {
        Assertions.assertTrue(mainPage.getLoggedInAsUsername(browserWrapper).isDisplayed());
    }

    public static void verifyThatAccountCreatedIsVisible(BrowserWrapper browserWrapper,
                                                         AccountCreatedPage accountCreatedPage) {
        Assertions.assertTrue(accountCreatedPage.getElementAccountCreatedLabel(browserWrapper).isDisplayed());
    }

    public static void verifyThatLoginToYourAccountIsVisible(BrowserWrapper browserWrapper, LoginPage loginPage) {
        Assertions.assertTrue(loginPage.getElementLoginToYourAccountLabel(browserWrapper).isDisplayed());
    }

    public static void verifyThatNewUserSignupIsVisible(BrowserWrapper browserWrapper, LoginPage loginPage) {
        Assertions.assertTrue(loginPage.getElementNewUserSignupLabel(browserWrapper).isDisplayed());
    }
}

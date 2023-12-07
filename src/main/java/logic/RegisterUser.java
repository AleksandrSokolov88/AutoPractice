package logic;
import model.GeneratedUser;
import pages.AccountCreatedPage;
import pages.LoginPage;
import pages.MainPage;
import pages.SignupPage;
import utils.BrowserWrapper;
import utils.actions.NavigateToUrl;
import utils.actions.ScrollPage;

import java.io.IOException;

public class RegisterUser {

    public void enterNameAndEmail(BrowserWrapper browserWrapper, LoginPage loginPage, GeneratedUser generatedUser) throws IOException {
        loginPage.sendKeysToNewUserSignupName(browserWrapper, generatedUser.getName());
        loginPage.sendKeysToNewUserSignupEmail(browserWrapper, generatedUser.getEmail());
    }

    public void clickOnSignupButton(BrowserWrapper browserWrapper, LoginPage loginPage) {
        loginPage.clickOnSignupButton(browserWrapper);
    }

    public void fillDetailsAccountInf(BrowserWrapper browserWrapper, SignupPage signupPage, GeneratedUser generatedUser) {
        if ("Male".equals(generatedUser.getTitle())) {
            signupPage.clickOnAccountInformationTitleMale(browserWrapper);
        } else {
            signupPage.clickOnAccountInformationTitleFemale(browserWrapper);
        }
        signupPage.sendKeysToAccountInformationPassword(browserWrapper, generatedUser.getPassword());
        signupPage.clickOnAccountInformationDayOfBirth(browserWrapper, generatedUser.getDayOfBirth());
        signupPage.clickOnAccountInformationMonthOfBirth(browserWrapper, generatedUser.getMonthOfBirth());
        signupPage.clickOnAccountInformationYearOfBirth(browserWrapper, generatedUser.getYearOfBirth());
    }

    public void scrollPage(BrowserWrapper browserWrapper, SignupPage signupPage) {
        ScrollPage.scrollPage(signupPage.getElementSignupForOurNewsletterCheckbox(browserWrapper));
    }

    public void selectSighupForOurNewsletter(BrowserWrapper browserWrapper, SignupPage signupPage, GeneratedUser generatedUser) {
        if (generatedUser.getSignupForOurNewsLetter()) {
            signupPage.clickOnSignupForOurNewsletterCheckbox(browserWrapper);
        }
    }

    public void selectReceiveSpecialOffers(BrowserWrapper browserWrapper, SignupPage signupPage, GeneratedUser generatedUser) {
        if (generatedUser.getReceiveSpecialOffers()) {
            signupPage.clickOnReceiveSpecialOffersCheckbox(browserWrapper);
        }
    }

    public void fillDetailsAddressInf(BrowserWrapper browserWrapper, SignupPage signupPage, GeneratedUser generatedUser) {
        signupPage.sendKeysToFirstNameField(browserWrapper, generatedUser.getFirstName());
        signupPage.sendKeysToLastNameField(browserWrapper, generatedUser.getLastName());
        signupPage.sendKeysToCompanyField(browserWrapper, generatedUser.getCompany());
        signupPage.sendKeysToAddress1Field(browserWrapper, generatedUser.getAddress());
        signupPage.sendKeysToAddress2Field(browserWrapper, generatedUser.getAddress2());
        signupPage.clickOnCountryField(browserWrapper, generatedUser.getCountry());
        signupPage.sendKeysToStateField(browserWrapper, generatedUser.getState());
        signupPage.sendKeysToCityField(browserWrapper, generatedUser.getCity());
        signupPage.sendKeysToZipcodeField(browserWrapper, generatedUser.getZipCode());
        signupPage.sendKeysToMobileNumberField(browserWrapper, generatedUser.getMobileNumber());

    }

    public void clickOnCreateAccountButton(BrowserWrapper browserWrapper, SignupPage signupPage) {
        signupPage.clickOnCreateAccountButton(browserWrapper);
    }

    public void clickOnContinueButton(BrowserWrapper browserWrapper, AccountCreatedPage accountCreatedPage) {
        accountCreatedPage.clickOnContinueButton(browserWrapper);
    }

    public void clickOnLogoutButton(BrowserWrapper browserWrapper, MainPage mainPage) {
        mainPage.clickOnLogoutButton(browserWrapper);
    }

    public void registerUserFlow(BrowserWrapper browserWrapper, LoginPage loginPage, SignupPage signupPage,
                                 GeneratedUser generatedUser, AccountCreatedPage accountCreatedPage, MainPage mainPage) throws IOException {
        NavigateToUrl.navigateToUrl(browserWrapper);
        mainPage.clickOnSignupLoginButton(browserWrapper);
        enterNameAndEmail(browserWrapper, loginPage, generatedUser);
        clickOnSignupButton(browserWrapper, loginPage);
        fillDetailsAccountInf(browserWrapper, signupPage, generatedUser);
        scrollPage(browserWrapper, signupPage);
        selectSighupForOurNewsletter(browserWrapper, signupPage, generatedUser);
        selectReceiveSpecialOffers(browserWrapper, signupPage, generatedUser);
        fillDetailsAddressInf(browserWrapper, signupPage, generatedUser);
        clickOnCreateAccountButton(browserWrapper, signupPage);
        clickOnContinueButton(browserWrapper, accountCreatedPage);
        clickOnLogoutButton(browserWrapper, mainPage);
    }
}



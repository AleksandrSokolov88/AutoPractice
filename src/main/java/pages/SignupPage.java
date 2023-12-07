package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utils.BrowserWrapper;

public class SignupPage extends AbstractPage {
    private String accountInformationLabel = "//b[text()='Enter Account Information']";
    private String accountInformationTitleMale = "//input[@type='radio' and @id='id_gender1']";
    private String accountInformationTitleFemale = "//input[@type='radio' and @id='id_gender2']";
    private String accountInformationPassword = "//input[@type='password']";
    private String accountInformationDayOfBirth = "//select[@id='days']//option[@value='%s']";
    private String accountInformationMonthOfBirth = "//select[@id='months']//option[@value='%s']";
    private String accountInformationYearOfBirth = "//select[@id='years']//option[@value='%s']";
    private String signupForOurNewsletterCheckbox = "//input[@type='checkbox' and @id='newsletter']";
    private String receiveSpecialOffersCheckbox = "//input[@type='checkbox' and @id='optin']";
    private String firstNameField = "//input[@type='text' and @id='first_name']";
    private String lastNameField = "//input[@type='text' and @id='last_name']";
    private String companyField = "//input[@type='text' and @id='company']";
    private String address1Field = "//input[@type='text' and @id='address1']";
    private String address2Field = "//input[@type='text' and @id='address2']";
    private String countryField = "//option[@value='%s']";
    private String stateField = "//input[@type='text' and @id='state']";
    private String cityField = "//input[@type='text' and @id='city']";
    private String zipcodeField = "//input[@type='text' and @id='zipcode']";
    private String mobileNumberField = "//input[@type='text' and @id='mobile_number']";
    private String createAccountButton = "//button[@type='submit' and text()='Create Account']";

    public WebElement getAccountInformationLabel(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, this.accountInformationLabel);
    }

    public void clickOnAccountInformationTitleMale(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, accountInformationTitleMale);
    }

    public void clickOnAccountInformationTitleFemale(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, accountInformationTitleFemale);
    }

    public void sendKeysToAccountInformationPassword(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, accountInformationPassword, text);
    }

    public void clickOnAccountInformationDayOfBirth(BrowserWrapper browserWrapper, int day) {
        clickButton(browserWrapper, String.format(accountInformationDayOfBirth, day));
    }

    public void clickOnAccountInformationMonthOfBirth(BrowserWrapper browserWrapper, int month) {
        clickButton(browserWrapper, String.format(accountInformationMonthOfBirth, month));
    }

    public void clickOnAccountInformationYearOfBirth(BrowserWrapper browserWrapper, int year) {
        clickButton(browserWrapper, String.format(accountInformationYearOfBirth, year));
    }

    public void clickOnSignupForOurNewsletterCheckbox(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, signupForOurNewsletterCheckbox);
    }

    public WebElement getElementSignupForOurNewsletterCheckbox(BrowserWrapper browserWrapper) {
        return getElement(browserWrapper, signupForOurNewsletterCheckbox);
    }

    public void clickOnReceiveSpecialOffersCheckbox(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper, receiveSpecialOffersCheckbox);
    }

    public void sendKeysToFirstNameField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, firstNameField, text);
    }

    public void sendKeysToLastNameField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, lastNameField, text);
    }

    public void sendKeysToCompanyField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, companyField, text);
    }

    public void sendKeysToAddress1Field(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, address1Field, text);
    }

    public void sendKeysToAddress2Field(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, address2Field, text);
    }

    public void clickOnCountryField(BrowserWrapper browserWrapper, String text) {
        clickButton(browserWrapper, String.format((countryField), text));
    }

    public void sendKeysToStateField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, stateField, text);
    }

    public void sendKeysToCityField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, cityField, text);
    }

    public void sendKeysToZipcodeField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, zipcodeField, text);
    }

    public void sendKeysToMobileNumberField(BrowserWrapper browserWrapper, String text) {
        sendKeys(browserWrapper, mobileNumberField, text);
    }

    public void clickOnCreateAccountButton(BrowserWrapper browserWrapper) {
        clickButton(browserWrapper,createAccountButton);
    }
}

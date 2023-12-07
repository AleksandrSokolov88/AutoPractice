package utils.actions;

import utils.BrowserWrapper;

public class NavigateToUrl {
    private static final String START_URL = "https://automationexercise.com/";

    public static void navigateToUrl(BrowserWrapper browserWrapper) {
        browserWrapper.getChromeDriver().get(START_URL);

    }
}

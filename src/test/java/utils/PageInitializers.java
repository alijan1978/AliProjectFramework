package utils;

import pages.LoginPage;

public class PageInitializers {

    public static LoginPage loginPage;

    public static void initializePageObject() {

    // We Initializer object of the LoginPage class

        loginPage = new LoginPage();

    }
}

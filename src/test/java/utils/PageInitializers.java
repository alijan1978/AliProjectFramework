package utils;

import pages.AddEmployeePage;
import pages.DashboardPage;
import pages.LoginPage;

public class PageInitializers {

    public static LoginPage loginPage;

    public static DashboardPage dashboardPage;

    public static AddEmployeePage addEmployeePage;

    public static void initializePageObject() {

    // We Initialize object of the LoginPage class

        loginPage = new LoginPage();

        dashboardPage = new DashboardPage();

        addEmployeePage = new AddEmployeePage();

    }
}

package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Given("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {
        sendText(loginPage.userNameField, ConfigReader.getPropertiesValue("username"));
        sendText(loginPage.passwordField, ConfigReader.getPropertiesValue("password"));

    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);

    }

    @Then("admin user is navigated to the dashboard page")
    public void admin_user_is_navigated_to_the_dashboard_page() {
        System.out.println("everything is great ");

    }

    @Given("user enters invalid username and valid password")
    public void user_enters_invalid_username_and_valid_password() {
        sendText(loginPage.userNameField, "wrongUsername");
        sendText(loginPage.passwordField, ConfigReader.getPropertiesValue("password"));

    }

    @Then("user sees the error message {string}")
    public void user_sees_the_error_message(String string) {
        String expectedMessage=string;
        String actualMessage=loginPage.errorMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        // expectedMessage : like showing invalid credentials
        //actualMessage : showing username field not be empty
    }
}

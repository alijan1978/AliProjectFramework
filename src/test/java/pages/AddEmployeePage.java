package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id = "firstName")
    public WebElement firstNameField;

    @FindBy(id = "middleName")
    public WebElement middleNameField;

    @FindBy(id = "lastName")
    public WebElement lastNameField;

    @FindBy(id = "photofile")
    public WebElement photofileField;

    @FindBy(id = "chkLogin")
    public WebElement chkLoginField;

    @FindBy(id = "user_name")
    public WebElement userNameField;

    @FindBy(id = "user_password")
    public WebElement userPasswordField;

    @FindBy(id = "re_password")
    public WebElement passwordConfirmation;

    @FindBy(id = "status")
    public WebElement statusDropDown;

    @FindBy(id = "btnSave")
    public WebElement saveButton;


    public AddEmployeePage(){

        PageFactory.initElements(driver, this);

    }
}

package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(id = "menuUserLink")
    public WebElement btnUser;
    @FindBy(css = ".create-new-account.ng-scope")
    public WebElement btnCreateNewUser;
    @FindBy(xpath = "//input[@name='usernameRegisterPage']")
    public WebElement txtUsername;
    @FindBy(xpath = "//input[@name='emailRegisterPage']")
    public WebElement txtEmail;
    @FindBy(xpath = "//input[@name='passwordRegisterPage']")
    public WebElement txtPassword;
    @FindBy(xpath = "//input[@name='confirm_passwordRegisterPage']")
    public WebElement txtConfirmPassword;
    @FindBy(xpath = "//input[@name='first_nameRegisterPage']")
    public WebElement txtFirstName;
    @FindBy(xpath = "//input[@name='last_nameRegisterPage']")
    public WebElement txtLastName;
    @FindBy(xpath = "//input[@name='phone_numberRegisterPage']")
    public WebElement txtPhoneNumber;
    @FindBy(xpath = "//select[@name='countryListboxRegisterPage']")
    public WebElement selectCountry;

    public RegisterPage() {
        super(driver);
    }

    public void navigatePage(){
        clickElement(btnUser);
        clickElement(btnCreateNewUser);
    }

    public void accountDetails(String user,String email, String password, String confirmPassword){
        writeToElememt(txtUsername,user);
        writeToElememt(txtEmail,email);
        writeToElememt(txtPassword,password);
        writeToElememt(txtConfirmPassword,confirmPassword);
    }

    public void ingresarUsuario(String user){
        writeToElememt(txtUsername,user);
    }

    public void ingresarCorreo(String user){
        writeToElememt(txtEmail,user);
    }

    public void ingresarContraseña(String user){
        writeToElememt(txtPassword,user);
    }
    public void ingresarCoContraseña(String user){
        writeToElememt(txtConfirmPassword,user);
    }

    public void personalDetails(){
        writeToElememt(txtFirstName,"Carlos");
        writeToElememt(txtLastName,"Zambrano");
        writeToElememt(txtPhoneNumber,"987654321");
        address();
    }

    public void address(){
        selectFromDropdownByText(selectCountry,"Peru");
    }



}

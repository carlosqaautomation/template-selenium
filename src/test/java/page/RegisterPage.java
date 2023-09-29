package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(id = "menuUserLink")
    public WebElement btnUser;

    @FindBy(css = ".create-new-account.ng-scope")
    public WebElement btnCreateNewUser;

    public RegisterPage() {
        super(driver);
    }

    public void navigatePage(){
        clickElement(btnUser);
        clickElement(btnCreateNewUser);
    }
}

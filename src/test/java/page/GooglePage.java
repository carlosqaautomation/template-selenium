package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
    private WebDriver driver;
    @FindBy(id = "APjFqb")
    public WebElement txtSearch;
    @FindBy(name = "btnK")
    public WebElement btnSearch;
    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void enterSearch(String search){
        this.txtSearch.sendKeys(search);
        this.btnSearch.click();
    }
    public void resultSearch(String search){

    }

}

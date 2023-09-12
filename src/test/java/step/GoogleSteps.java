package step;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.GooglePage;
import utils.ConfigManager;

public class GoogleSteps {
    private WebDriver driver;
    private GooglePage googlePage;

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(ConfigManager.getProperty("baseURL"));
        googlePage = new GooglePage(driver);
    }
    public void searchText(String search){
        googlePage.enterSearch(search);
        googlePage.resultSearch(search);
    }
}

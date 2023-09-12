package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import page.GooglePage;
import step.GoogleSteps;
import utils.ConfigManager;

public class StepDefinitionGoogle {

    GoogleSteps googleSteps = new GoogleSteps();

    @Given("que estoy en la página de Google")
    public void openBrowser(){
        googleSteps.openBrowser();
    }

    @When("ingreso {string} en el campo de búsqueda")
    public void ingreso_en_el_campo_de_búsqueda(String searchQuery) {
        googleSteps.searchText(searchQuery);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("hago clic en el botón de búsqueda")
    public void clickButton(){
    }

    @Then("veo resultados de búsqueda relacionados con {string}")
    public void resultSearch(String result){

    }


}

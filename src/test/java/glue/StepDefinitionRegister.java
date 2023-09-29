package glue;

import io.cucumber.java.en.Given;
import step.BaseSteps;

public class StepDefinitionRegister {
    BaseSteps baseSteps = new BaseSteps();

    @Given("Ingreso a la pagina Advantage")
    public void open(){
        baseSteps.openBrowser();
    }

    @Given("navego a la pagina crear cuenta")
    public void navigation(){
        baseSteps.navigatePageRegister();
    }
}

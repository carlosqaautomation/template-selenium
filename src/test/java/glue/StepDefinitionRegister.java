package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import step.BaseSteps;
import step.RegisterSteps;

public class StepDefinitionRegister {
    BaseSteps baseSteps = new BaseSteps();
    RegisterSteps registerSteps = new RegisterSteps();

    @Given("Ingreso a la pagina Advantage")
    public void open(){
        baseSteps.openBrowser();
    }

    @Given("navego a la pagina crear cuenta")
    public void navigation(){
        baseSteps.navigatePageRegister();
    }

    @When("Ingreso los detalles de mi cuenta")
    public void ingresoDetalleCuenta() {
        registerSteps.ingresoDatosCuenta();
    }

    @When("Ingreso el usuario {string}")
    public void ingreso_el_usuario(String usuario) {
        registerSteps.ingresarUsuario(usuario);
    }
    @When("Ingreso el correo {string}")
    public void ingreso_el_correo(String correo) {
        registerSteps.ingresarEmail(correo);
    }
    @When("Ingreso la contraseña {string}")
    public void ingreso_la_contraseña(String contraseña) {
        registerSteps.ingresarContraseña(contraseña);
    }
    @When("Ingreso la confirmacion de contraseña {string}")
    public void ingreso_la_confirmacion_de_contraseña(String contraseña) {
        registerSteps.ingresarConContraseña(contraseña);
    }

}

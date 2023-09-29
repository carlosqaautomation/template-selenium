package step;

import page.RegisterPage;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    public void ingresoDatosCuenta(){
        registerPage.accountDetails("","","","");
    }

    public void ingresarUsuario(String usuario){
        registerPage.ingresarUsuario(usuario);
    }

    public void ingresarEmail(String correo){
        registerPage.ingresarCorreo(correo);
    }

    public void ingresarContraseña(String contraseña){
        registerPage.ingresarContraseña(contraseña);
    }

    public void ingresarConContraseña(String contraseña){
        registerPage.ingresarCoContraseña(contraseña);
    }
}

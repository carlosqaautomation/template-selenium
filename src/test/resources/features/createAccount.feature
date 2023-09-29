Feature: Crear cuenta

  @caso-1
  Scenario: Crear una cuenta exitosa
    Given Ingreso a la pagina Advantage
    And navego a la pagina crear cuenta
    When Ingreso el usuario "Prueba"
    And  Ingreso el correo "prueba@gmail.com"
    And Ingreso la contraseña "Testing123"
    And Ingreso la confirmacion de contraseña "Testing123"
    When Ingreso mis datos personales

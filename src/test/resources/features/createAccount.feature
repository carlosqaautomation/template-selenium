Feature: Crear cuenta


  Scenario: Crear una cuenta exitosa
    Given Ingreso a la pagina Advantage
    And navego a la pagina crear cuenta
    When Ingreso el usuario "Prueba"
    And  Ingreso el correo "prueba@gmail.com"
    And Ingreso la contraseña "Testing123"
    And Ingreso la confirmacion de contraseña "Testing123"
    When Ingreso mis datos personales

  @caso-2
  Scenario: Crear una cuenta exitosa - 2
    Given Ingreso a la pagina Advantage
    And navego a la pagina crear cuenta
    When Ingreso el detalle de la cuenta v1
      | usuario | correo           | contraseña | confirm-contraseña |
      | Prueba  | prueba@gmail.com | Testing123 | Testing123         |

  @caso-3
  Scenario: Crear una cuenta exitosa - 3
    Given Ingreso a la pagina Advantage
    And navego a la pagina crear cuenta
    When Ingreso el detalle de la cuenta v2
      | usuario            | Prueba1           |
      | correo             | prueba1@gmail.com |
      | contraseña         | Testing123       |
      | confirm-contraseña | Testing123       |
    And Ingreso mis datos personales
      | nombre   | Carlos    |
      | apellido | Zambrano  |
      | celular  | 111111111 |
    And Ingreso mi direccion
      | pais          | Peru   |
      | ciudad        | Lima   |
      | direccion     | Lima   |
      | provincia     | Lima   |
      | codigo-postal | 123456 |
    And Accepto los terminos y condiciones
    And registro una cuenta



  @caso-4
  Scenario Outline: Crear una cuenta exitosa - 4
    Given Ingreso a la pagina Advantage
    And navego a la pagina crear cuenta
    When Ingreso el detalle de la cuenta v2
      | usuario            | <usuario>            |
      | correo             | <correo>             |
      | contraseña         | <contraseña>         |
      | confirm-contraseña | <confirm-contraseña> |

    Examples:
      | usuario | correo            | contraseña | confirm-contraseña |
      | Prueba  | prueba@gmail.com  | Testing123 | Testing123         |
      | Prueba1 | prueba1@gmail.com | Testing123 | Testing123         |

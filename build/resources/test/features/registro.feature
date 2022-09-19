#Autor: Andres Guzman
@stories

Feature: Andres quiere registrarce en la pagina web de Utest

  @scenario1
  Scenario: Ingresar Datos Personales
    Given Andres Ingresa Datos personales
      | textoNombre  | textoApellido | textoCorreo         | textoMes   | textoDia | textoAno |
      | Andres       | Guzman     | andres2990@gmail.com   | April      |  7       | 1995     |
    When El Ingresa Datos de Ubicacion Dispositivo y Contrasena
      |textoCiudad  | textoZip |textoPais |textoMovil | textoContrasena | textoConfirmarContrasena |
      | Fusagasugá  | 252212   |Colombia  |Samsung    | Choucair12*     | Choucair12*              |
    Then El finalizo su registro en Utest
      | MensajeExitoso                                                            |
      | Welcome to the world's largest community of freelance software testers! |

Feature: Como usuario de la aplicacion
  quiero ingresar a la web de Siigo y craer un usuario
  para verificar el correcto funcionamiento del modulo

  Scenario: El QA Engineer inicia sesion y accede al formulario de creacion de clientes y llena el formulario de creacion de cliente
    Given que el usuario ingresa a la aplicacion web de Siigo
    When se dirige a la opcion de crear y crea un usuario
      | userName                    | password   | tipoPersona | tipoIdentificacion   | identificacion | tipoIva               | indicativo | checkResponsabilidadFiscal    | cargoContacto    |
      | admin@siigoautomationqa.com | (#T0Nu@QrO | Es persona  | Cédula de ciudadanía | 1069489128     | No responsable de IVA | 604        | Régimen simple de tributación | Líder de Pruebas |
    Then el sistema muestra un mensaje de confirmacion "Perfil del tercero"
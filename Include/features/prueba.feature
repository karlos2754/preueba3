Feature: Inicio

  Scenario Outline: Prueba de inicio
    Given El usuario navega para iniciar secion
    When Usuario ingresa <correo> y <contraseña>
    And Click en boton siguiente
    Then El verifica pagina principal
    When Selecciona lugar cita medica
    When Informa fecha
    When Ingresa Comentario <comentario>
    And Click en boton Book Appointment

    Examples: 
      | comentario | correo   | contraseña                       |
      | prueba     | John Doe | g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM |

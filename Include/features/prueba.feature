#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
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

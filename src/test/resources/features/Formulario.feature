Feature: Automatización de Formulario

  @Formulario
  Scenario: Ingreso y/o selección de datos
    Given ingreso a la pagina de TutorialsPoint
    And ingreso los datos del formulario
      | firstName | lastName | sex  | yearsExperience | profession        |
      | York      | Correa   | Male | 5               | Automation Tester |
    And cargo una imagen y selecciono el tipo de Selenium "Selenium Webdriver"
    And selecciono el continente "North America" y los comandos de selenium
    Then hacemos click al boton enviar


    @Csv
    Scenario: Ingreso de datos mediante csv
      Given ingreso a la pagina de TutorialsPoint
      Then ingresamos la data
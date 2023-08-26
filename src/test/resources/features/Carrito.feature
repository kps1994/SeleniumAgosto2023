Feature: Compra de un articulo con Tarjeta de Credito
  Yo como usuario de la tienda DemoGuru99
  Quiero comprar un articulo con una tarjeta de credito
  Para ahorrar tiempo en hacer el tramite personal


  @Carrito1
  Scenario: Compro una sola vez
    Given la pagina DemoGuru esta disponible
    When doy click en generar tarjeta
    And capturo los datos de la tarjeta
    And selecciono la cantidad de productos y le doy comprar
    Then ingreso los datos de la tarjeta
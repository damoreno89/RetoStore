# language: es

@Utest
Característica: Realizar una compra en la tienda en línea

  Como cliente
  Quiero poder seleccionar un producto de una categoría en línea
  Para realizar una compra en el sitio web
Antecedentes:
Dado que david ingresa al aplicativo de ProductStore

Esquema del escenario: Selección de producto y verificación en el carrito de compras
Cuando selecciona la categoría "<categoria>"
Y selecciona un producto de la categoría "<producto>"
Y da click en Add To Cart
Entonces aparece un pop-up
Y da click en el carrito de compras para verificar que el producto seleccionado esté en el carrito

Ejemplos:
| categoria | producto          |
| Phones    | Samsung galaxy s6 |
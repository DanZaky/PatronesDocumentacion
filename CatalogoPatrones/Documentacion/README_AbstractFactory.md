# Patrón Abstract Factory

## Descripción

Es un patrón que define una interfaz para crear familias de objetos relacionados o dependientes sin especificar las clases concretas.

## Estructura Abstract Factory

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronFactoriaAbstracta.jpg.png)

## Participantes

  ### Cliente:
  La clase que llamará a la factoría adecuada ya que necesita crear uno de los objetos que provee la factoría. Es decir, el Cliente lo que quiere es obtener una instancia de alguno de los productos (ProductoA, ProductoB).
  ### FactoríaAbstracta: 
  Es de definición de la interfaces de las factorías. Debe de proveer un método para la obtención de cada objeto que pueda crear. ("crearProductoA()" y "crearProductoB()")
  ### FactoríasConcretas: 
  Estas son las diferentes familias de productos. Provee de la instancia concreta de la familia que se encarga de crear.
  ### ProductoAbstracto: 
  Definición de las interfaces para la familia de productos genéricos. En el diagrama son "ProductoA" y "ProductoB". 
  ### ProductoConcreto: 
  Implementación de los diferentes productos.

## Diseño Abstract Factory caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oAbstractFactory.png)

# Patrón Builder

## Descripción

  Como Patrón de diseño, el patrón Constructor es usado para permitir la creación de una variedad de objetos complejos desde un objeto fuente (Producto). 
  El objeto fuente se compone de una variedad de partes que contribuyen individualmente a la creación de cada objeto complejo a través de un conjunto de llamadas a interfaces comunes de la clase ConstructorAbstracto

## Estructura Builder
![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronBuilder.jpg)

## Participantes
   ### Constructor: 
   Especifica una interfaz abstracta para construir partes del objeto producto.
   ### CosntructorConcreto: 
   Implementa la interfaz de Constructor, construyendo y ensamblando las partes del producto.
   ### Director: 
   Construye un objeto a través de la interfaz Constructor.
   ### Producto: 
   Representa el objeto complejo bajo construcción.



## Diseño Builder caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oBuilder.png)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patronbuilder)

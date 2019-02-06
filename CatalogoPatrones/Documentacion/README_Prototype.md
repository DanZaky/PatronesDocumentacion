# Patrón Prototype

## Descripción

  Como Patrón de diseño, el patrón Constructor es usado para permitir la creación de una variedad de objetos complejos desde un objeto fuente (Producto). 
  El objeto fuente se compone de una variedad de partes que contribuyen individualmente a la creación de cada objeto complejo a través de un conjunto de llamadas a interfaces comunes de la clase ConstructorAbstracto

## Estructura Builder
![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronBuilder.jpg)

## Participantes
   ### Prtotipo: 
   Declara una interfaz para clonarse.
   ### PrototiporConcreto: 
   Implementa la operación para clonarse.
   ### Cliente: 
   Crea un nuevo objeto pidiéndole a un Prototipo para que se clone.

## Diseño Prototype caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronProtipo.jpg)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patronprototype)
# Patrón Factory Method

## Descripción

  Define una interfaz para crear un objeto, pero dejando en manos de las subclases la decisión de qué clase concreta instanciar
  Permite que una clase delegue en sus subclases la creación de objetos

## Estructura Factory Method

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronFactoria.jpg)

## Participantes
    ### Producto: 
    Define la interfaz de los objetos que la Factoría crea.
    ### ProductoConcreto: 
    Define la interfaz del Producto.
    ### Creador: 
    Declara el método factoría que devuelve un objeto de tipo Producto
    ### CreadorConcreto: 
    Sobreescribe el método Factoría para que devuelva un ProductoConcreto



## Diseño Factory Method caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oFactoryMethod.png)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patronfactorymethod)

# Patrón Adapter

## Descripción

Este patrón convierte la interfaz de una clase en otra interfaz para adaptarla a las necesidades de un desarrollo concreto. 
El patrón Adaptador permite que clases con interfaces incompatibles puedan trabajar juntas.

## Estructura Adapter
![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronAdaptador.jpg)

## Participantes

    ### Target: 
    Define la interfaz específica del dominio que Cliente usa.
    ### Cliente: 
    Colabora con la conformación de objetos para la interfaz Target.
    ### Adaptado: 
    Define una interfaz existente que necesita adaptarse
    ### Adapter: 
    Adapta la interfaz de Adaptee a la interfaz Target
    
## Diseño Adapter caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oAdapter.png)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patronadapter)

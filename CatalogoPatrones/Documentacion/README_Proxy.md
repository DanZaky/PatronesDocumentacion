# Patrón Proxy

## Descripción

Este patrón nos proporciona un sustituto o representante de otro objeto para controlar el acceso a este.

## Estructura Proxy
![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronProxy.jpg)

## Participantes

   ### Sujeto:
    Define la interfaz común para Proxy y SujetoReal, de manera que pueda usarse un Proxy donde se espera un SujetoReal.
   ### Sujeto Real:
    Define el objeto real representado.
   ### Proxy:
    Mantiene un referencia que permite al proxy acceder al objeto real. 
    Proporciona una interfaz idéntica a la del Sujeto de manera que pueda ser sustituido por un SujetoReal. 
    Controla el acceso al SujetoReal, puede ser el responsable de su creación y borrado.

## Diseño Proxy caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oProxy.png)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patronproxy)

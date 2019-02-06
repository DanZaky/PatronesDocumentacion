# Patrón Decorador

## Descripción
El patrón responde a la necesidad de añadir dinámicamente funcionalidad a un objeto. 
Esto nos permite no tener que crear sucesivas clases que hereden de la primera incorporando la nueva funcionalidad, sino otras que la implementan y se asocian a la primera.

## Estructura Decorador
![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/PatronDecorador.jpg)

## Participantes

   ### Componente: 
    Define la interfaz de los objetos a los que se peude añadir responsabilidades de manera dinámica
   ### ComponenteConcreto: 
    Define un objeto al que añadir responsabilidades de manera dinámica
   ### Decorador: 
    Mantiene una referencia al objeto componente y define una interfaz conforme a la del componente
   ### DecoradorConcreto: 
    Añade responsabilidades al componente al que referencia

## Diseño Decorador caso practico

![img](https://github.com/DanZaky/PatronesDocumentacion/blob/master/CatalogoPatrones/img/Dise%C3%B1oDecorador.png)

## [Ejemplo practico](https://github.com/DanZaky/PatronesDocumentacion/tree/master/CatalogoPatrones/src/patrondecorador)

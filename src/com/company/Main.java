package com.company;

import javax.lang.model.element.VariableElement;

//Enunciado del ejercicio:
//
//En este ejercicio practicarás las estructuras de control, para ello deberás crear:
//
//Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
//Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
//
//Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
//
//Incrementar el valor de la variable en uno cada vez que se ejecute.
//
//Mostrarlo por pantalla cada vez que se ejecute.
//
//Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
//
//Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando
// en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
//
//Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
// se deberá mandar un mensaje por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una
// estación.
public class Main {
//RODRIGO ALVAREZ//
    public static void main(String[] args) {
        int i1 = 2;
        ///////////////////////////////////////////////
        if(i1 > 0);
    while( 10 > i1 ) {
        System.out.println(i1);
        i1 = i1 + 1;}
         ////////////////////////////////////////////
 i1 = 2;
        do{
            System.out.println(i1+ "do while");
            i1 = i1 + 1;
    }while (i1 < 10);
        ////////////////////////////////////////////
        for (int e1 =0; e1 <= 3; e1 = e1 + 1 ) {
            System.out.println(e1 + "linea" + e1);
        }
        ////////////////////////////////////////////
        var estacion = "verano" ;
        switch(estacion){
            case "verano":
            System.out.println("es verano");
            break;
            case "otonio":
                System.out.println("es otonio" );
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            default:
                System.out.println("es primavera");

        }

    }
}

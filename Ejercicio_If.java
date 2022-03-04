package com.company;

public class Ejercicio_If {

    //- Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
    //- Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
    // el bloque de código que tendrá el bucle deberá:
    //    - Incrementar el valor de la variable en uno cada vez que se ejecute.
    //    - Mostrarlo por pantalla cada vez que se ejecute.
    //- Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
    //- Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0
    // y su condición será que la variable sea igual o menor que 3,
    // se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
    //- Por último, para el Switch, deberás crear la variable estacion,
    // y distintos *case* para las cuatro estaciones del año.
    // Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está.
    // También habrá que poner un default para cuando el valor de la variable no sea una estación.

    public static void main(String[] args){


        int numeroIf = -15;
        int numeroWhile = 0;
        int numeroFor = 0;
        String estacion = "verano";


        if(numeroIf > 0){

            System.out.println("El número es positivo");

        } else if (numeroIf < 0) {

            System.out.println("El número es negativo");

        }
        else {
            System.out.println("El número es 0");
        }

        System.out.println("*******************************");


        while(numeroWhile < 3){

            numeroWhile++;

            System.out.println("While: Valor de la variable = " + numeroWhile);

        }

        System.out.println("*******************************");

        do{
            System.out.println("Do-while: Valor de la variable = " + numeroWhile);
        }while(numeroWhile > 3);

        System.out.println("*******************************");

        for(numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("Valor de variable del for: " + numeroFor);

        }

        System.out.println("*******************************");

        switch(estacion){
            case "invierno":
                System.out.println("Estamos en invierno");
                break;

            case "primavera":
                System.out.println("Estamos en primavera");
                break;

            case "verano":
                System.out.println("Estamos en verano");
                break;

            case "otoño":
                System.out.println("Estamos en otoño");
                break;

            default:
                System.out.println("Esta no es una estación");
        }

    }
}

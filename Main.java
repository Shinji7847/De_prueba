package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Declarar una variable de tipo int llamada numero1.

        int numero1 = 0;

        //Mostrarla por pantalla.

        System.out.println("El valor de la variable numero1 es " + numero1);

        //Modificar el valor de la variable numero1.

        numero1 += 1;

        //Mostrarla por pantalla.

        System.out.println("El nuevo valor de la variable es " + numero1);

        //Crea un array de 4 elementos.

        int miArray[] = new int[4];

        miArray[0] = 2;
        miArray[1] = 3;
        miArray[2] = 5;
        miArray[3] = 10;

        //Mostrar el elemento en la posición 0.

        System.out.println("El elemento en la primera posicion es " + miArray[0]);

    }
}

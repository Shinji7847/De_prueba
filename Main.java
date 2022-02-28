package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //llamado a una funcion que suma tres valores

        int a, b, c, resultado;

        a = 10;
        b = 35;
        c = 25;

        resultado = suma( a, b, c);

        System.out.println("El resultado de la suma es: " + resultado);

    }

    //Función
    public static int suma (int a, int b, int c){

        int resultado;

        resultado = a + b + c;

        return resultado;
    }
}

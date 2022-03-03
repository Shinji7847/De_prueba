package com.company;

public class EjerciciosFunciones {

    public static void main(String[] args) {
	// write your code here

        int a, b, c, resultado;

        a = 10;
        b = 35;
        c = 25;

        resultado = suma( a, b, c);

        System.out.println("El resultado de la suma es: " + resultado);

        System.out.println("*************************************************************");

        Coche miCoche = new Coche();

        miCoche.muestraDatos();

        miCoche.incrementaPuertas(1);

    }

    //Función
    public static int suma (int a, int b, int c){

        int resultado;

        resultado = a + b + c;

        return resultado;
    }
}
//Segunda parte
class Coche {

    private int numero_puertas;

    public Coche(){

        numero_puertas = 2;
    }

    public void muestraDatos(){

        int num_Puertas = numero_puertas;

        System.out.println("El coche tiene " + num_Puertas + " puertas");

    }

    public void incrementaPuertas(int cuantas_Puertas){

        numero_puertas = numero_puertas + cuantas_Puertas;

        System.out.println("El coche ahora tiene " + numero_puertas + " puertas");

    }
    }

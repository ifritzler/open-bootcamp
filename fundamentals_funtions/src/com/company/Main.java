package com.company;

public class Main {

    public static void main(String[] args) {
        /* First Exercise*/
        int resultado;
        resultado = sumatoriaTriple(4,5,6);
        System.out.println(resultado);

        /* Second Exercise */
        Coche miCoche = new Coche();
        miCoche.agregarPuerta();
    }

    public static int sumatoriaTriple(int a, int b, int c) {
        return a + b + c;
    }


}

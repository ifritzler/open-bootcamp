package com.company;

public class Main {

    public static void main(String[] args) {
        // Ejercicio numero 1
        int numeroIf = -1;
        int numeroWhile = 0;

        if (numeroIf >= 0) {
            System.out.println("El numero " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El numero " + numeroIf + " es el numero 0");
        } else {
            System.out.println("El numero " + numeroIf + " es negativo");
        }

        // Ejercicio 2

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        numeroWhile = 0;

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while (numeroWhile < 1);

        // Ejercicio 3

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        // Ejercicio 4

        String estacion = "Verano";

        switch (estacion) {
            case "Otoño":
                System.out.println("ES OTOÑO");
                break;
            case "Invierno":
                System.out.println("ES INVIERNO");
                break;
            case "Primavera":
                System.out.println("ES PRIMAVERA");
            case "Verano":
                System.out.println("ES VERANO");
                break;
            default:
                System.out.println("'" + estacion + "'" + " no es una estacion valida.");
        }
    }
}

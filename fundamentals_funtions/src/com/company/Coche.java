package com.company;

public class Coche {
    private int puertas;

    public Coche(){
        this.puertas = 2;
        System.out.println("Coche Creado. Numero de puertas " + this.puertas + ".");
    }

    public void agregarPuerta(){
        this.puertas += 1;
        System.out.println("Se agrego una puerta. Puertas: " + this.puertas);
    }
}

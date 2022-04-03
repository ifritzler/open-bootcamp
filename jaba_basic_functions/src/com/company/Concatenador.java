package com.company;

import java.util.ArrayList;
import java.util.List;

public class Concatenador {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Manolo");
        nombres.add("Ilan");
        nombres.add("Rocio");
        nombres.add("Carlos");
        nombres.add("Paola");
        nombres.add("Virginia");
        nombres.add("Livio");

        String nombresConcatenados = concatenarConBucle(nombres);
        System.out.println(nombresConcatenados);
    }

    static String concatenarConBucle(List<String> textos) {
        StringBuilder concatenados = new StringBuilder();
        for(String texto : textos){
            concatenados.append(texto).append(" ");
        }
        return concatenados.toString();
    }

}

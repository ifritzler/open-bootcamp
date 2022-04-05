package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        iCocheCRUD cocheCRUD = new CocheCRUDImpl();

        Coche coche = new Coche("Hilux", "Diesel", 2005, "Toyota");
        Coche coche2 = new Coche("Hilux", "Diesel", 2006, "Toyota");
        Coche coche3 = new Coche("Hilux", "Diesel", 2007, "Toyota");

        cocheCRUD.save(coche);
        cocheCRUD.save(coche2);
        cocheCRUD.save(coche3);

        List<Coche> coches = cocheCRUD.findAll();
        for (Coche c : coches) {
            System.out.println(coche);
        }

        cocheCRUD.delete(coche2);
        System.out.println("SE ELIMINO UN COCHE:");
        for (Coche c : coches) {
            System.out.println(coche);
        }
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        SmartDevice samsungJ5 = new SmartPhone("J5", "Intel", "Litio", "4GB", 700, 1030);
        SmartDevice samsungWatch = new SmartWatch("Watch10", "AMD", "Litio", "1GB", 200);

        System.out.println(samsungJ5);
        System.out.println(samsungWatch);
    }
}

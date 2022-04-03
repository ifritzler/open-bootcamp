package com.company;

public class Main {

    public static void main(String[] args) {
	    float price = 150.5f;
        float priceIVA = iva(price);

        System.out.println("Con iva: " + priceIVA + "; Sin iva: " + price);
    }

    static float iva(float price) {
        final float IVA = 21.0f;
        float difference = price * IVA / 100.0f;

        return price + difference;
    }
}

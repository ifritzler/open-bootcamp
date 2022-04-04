package com.company;

public class SmartPhone extends SmartDevice{
    private Integer anchoPixeles;
    private Integer altoPixeles;

    public SmartPhone() {
    }

    /**
     * 
     * @param modelo
     * @param procesador
     * @param bateria
     * @param almacenamiento
     * @param anchoPixeles
     * @param altoPixeles
     */
    public SmartPhone(String modelo, String procesador, String bateria, String almacenamiento,
                      Integer anchoPixeles, Integer altoPixeles) {
        super(modelo, procesador, bateria, almacenamiento);
        this.anchoPixeles = anchoPixeles;
        this.altoPixeles = altoPixeles;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "anchoPixeles=" + anchoPixeles +
                ", altoPixeles=" + altoPixeles +
                "} " + super.toString();
    }
}

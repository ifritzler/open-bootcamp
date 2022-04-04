package com.company;

public class SmartWatch extends SmartDevice{
    private Integer diametroPixeles;

    public SmartWatch(Integer diametroPixeles) {
        this.diametroPixeles = diametroPixeles;
    }

    public SmartWatch(String modelo, String procesador, String bateria, String almacenamiento, Integer diametroPixeles) {
        super(modelo, procesador, bateria, almacenamiento);
        this.diametroPixeles = diametroPixeles;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "diametroPixeles=" + diametroPixeles +
                "} " + super.toString();
    }
}

package com.company;

/**
 * Esta clase es madre de todas las clases de dispositivos inteligentes.
 */
public class SmartDevice {
    private String modelo;
    private String procesador;
    private String bateria;
    private String almacenamiento;

    public SmartDevice(){}

    /**
     *
     * @param modelo Ejemplo:"Xiaomi RedMi 8"
     * @param procesador
     * @param bateria
     * @param almacenamiento
     */
    public SmartDevice(String modelo, String procesador, String bateria, String almacenamiento) {
        this.modelo = modelo;
        this.procesador = procesador;
        this.bateria = bateria;
        this.almacenamiento = almacenamiento;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", procesador='" + procesador + '\'' +
                ", bateria='" + bateria + '\'' +
                ", almacenamiento='" + almacenamiento + '\'' +
                '}';
    }
}

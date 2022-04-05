package com.company;

import java.util.Objects;

public class Coche {
    private String modelo;
    private String tipoGasolina;
    private Integer year;
    private String marca;

    public Coche(){}

    public Coche(String modelo, String tipoGasolina, Integer year, String marca) {
        this.modelo = modelo;
        this.tipoGasolina = tipoGasolina;
        this.year = year;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoGasolina() {
        return tipoGasolina;
    }

    public void setTipoGasolina(String tipoGasolina) {
        this.tipoGasolina = tipoGasolina;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "modelo='" + modelo + '\'' +
                ", tipoGasolina='" + tipoGasolina + '\'' +
                ", year=" + year +
                ", marca='" + marca + '\'' +
                '}';
    }

}

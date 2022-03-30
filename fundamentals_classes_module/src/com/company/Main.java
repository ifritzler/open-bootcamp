package com.company;

public class Main {

    public static void main(String[] args) {
        Persona persona = new Persona("Ilan", "+542236333333", 27);

        System.out.println(
                "Mi nombre es " + persona.getNombre() +
                        " y tengo " + persona.getEdad() +
                        " anios. Si quieres contactarme, mi numero de telefono es: " +
                        persona.getTelefono() + "."
        );
    }

    public static class Persona {
        private String nombre;
        private String telefono;
        private int edad;

        public Persona() {
        }

        public Persona(String nombre, String telefono, int edad) {
            this.setNombre(nombre);
            this.setEdad(edad);
            this.setTelefono(telefono);
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getTelefono() {
            return this.telefono;
        }
    }
}

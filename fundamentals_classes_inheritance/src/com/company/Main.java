package com.company;

public class Main {

    public static void main(String[] args) {
	    Cliente cliente = new Cliente(27, "Ilan", "+542236232323", 20000);
        Trabajador trabajador = new Trabajador(24, "Lucas", "+542234565656", 60000);
    }

    public abstract static class Persona {
        private int edad;
        private String telefono;
        private String nombre;

        public Persona(int edad, String nombre, String telefono) {
            this.edad =edad;
            this.nombre = nombre;
            this.telefono = telefono;
        }


        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    }

    public static class Cliente extends Persona {
        private int credito;

        public Cliente(int edad, String nombre, String telefono, int credito) {
            super(edad, nombre, telefono);
            this.credito = credito;
        }

        public int getCredito() {
            return credito;
        }

        public void setCredito(int credito) {
            this.credito = credito;
        }
    }

    public static class Trabajador extends Persona {
        private int salario;

        public Trabajador(int edad, String nombre, String telefono, int salario) {
            super(edad, nombre, telefono);
            this.salario = salario;
        }

        public int getSalario() {
            return salario;
        }

        public void setSalario(int salario) {
            this.salario = salario;
        }
    }

}

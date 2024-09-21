package com.example;

public class Perro extends Mascota {
    public Perro(String nombre, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, "Perro", raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public String hacerSonido() {
        return "¡Guau! ¡Guau!";
    }

    @Override
    public String alimentar() {
        return getNombre() + " se alimenta con croquetas.";
    }

    @Override
    public String cuidar() {
        return getNombre() + " necesita paseos y baños regulares.";
    }
}

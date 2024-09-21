package com.example;

public class Tortuga extends Mascota {
    public Tortuga(String nombre, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, "Tortuga", raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public String hacerSonido() {
        return "¡No hace ruido!";
    }

    @Override
    public String alimentar() {
        return getNombre() + " se alimenta de vegetales y frutas.";
    }

    @Override
    public String cuidar() {
        return getNombre() + " necesita un ambiente húmedo y cálido.";
    }
}

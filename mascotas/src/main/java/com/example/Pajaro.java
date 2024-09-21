package com.example;

public class Pajaro extends Mascota {
    public Pajaro(String nombre, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, "Pájaro", raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public String hacerSonido() {
        return "¡Pío! ¡Pío!";
    }

    @Override
    public String alimentar() {
        return getNombre() + " se alimenta con semillas y frutas.";
    }

    @Override
    public String cuidar() {
        return getNombre() + " necesita un espacio amplio para volar y jugar.";
    }
}
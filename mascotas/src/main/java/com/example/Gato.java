package com.example;

public class Gato extends Mascota {
    public Gato(String nombre, String raza, int edad, String tamaño, String color, String estadoSalud) {
        super(nombre, "Gato", raza, edad, tamaño, color, estadoSalud);
    }

    @Override
    public String hacerSonido() {
        return "¡Miau! ¡Miau!";
    }

    @Override
    public String alimentar() {
        return getNombre() + " se alimenta con alimento balanceado.";
    }

    @Override
    public String cuidar() {
        return getNombre() + " necesita ser cepillado y jugar regularmente.";
    }
}

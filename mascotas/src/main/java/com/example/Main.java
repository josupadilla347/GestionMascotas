package com.example;

public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", "Labrador", 3, "Mediano", "Dorado", "Saludable");
        Gato gato = new Gato("Luna", "Persa", 2, "Pequeño", "Blanco", "Saludable");
        Pajaro pajaro = new Pajaro("Tweety", "Canario", 1, "Pequeño", "Amarillo", "Saludable");
        Tortuga tortuga = new Tortuga("Tito", "Aldabra", 5, "Grande", "Verde", "Saludable");

        // Prueba de funcionalidades
        System.out.println(perro.mostrarInformacion());
        System.out.println(perro.hacerSonido());
        System.out.println(perro.alimentar());
        System.out.println(perro.cuidar());

        System.out.println(gato.mostrarInformacion());
        System.out.println(gato.hacerSonido());
        System.out.println(gato.alimentar());
        System.out.println(gato.cuidar());

        System.out.println(pajaro.mostrarInformacion());
        System.out.println(pajaro.hacerSonido());
        System.out.println(pajaro.alimentar());
        System.out.println(pajaro.cuidar());

        System.out.println(tortuga.mostrarInformacion());
        System.out.println(tortuga.hacerSonido());
        System.out.println(tortuga.alimentar());
        System.out.println(tortuga.cuidar());
    }
}
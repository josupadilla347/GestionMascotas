package com.example;

public abstract class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String tamaño;
    private String color;
    private String estadoSalud;

    public Mascota(String nombre, String especie, String raza, int edad, String tamaño, String color, String estadoSalud) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
        this.color = color;
        this.estadoSalud = estadoSalud;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getTamaño() {
        return tamaño;
    }

    public String getColor() {
        return color;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public abstract String hacerSonido();
    public abstract String alimentar();
    public abstract String cuidar();

    public String mostrarInformacion() {
        return "Nombre: " + nombre + "\nEspecie: " + especie + "\nRaza: " + raza + 
               "\nEdad: " + edad + "\nTamaño: " + tamaño + "\nColor: " + color + 
               "\nEstado de salud: " + estadoSalud + "\n";
    }
}
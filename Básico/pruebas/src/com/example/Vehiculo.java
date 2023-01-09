package com.example;

public class Vehiculo {
    protected String fabricante;
    protected String modelo;
    protected int year;
    protected int km;
    protected int precio;

    public Vehiculo(String fabricante, String modelo, int year, int km, int precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.year = year;
        this.km = km;
        this.precio = precio;
    }


}

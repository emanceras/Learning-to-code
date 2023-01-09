package com.example;

public class Main {
    public static void main(String[] args) {
        Vehiculo Coche = new Vehiculo("Ford", "Mondeo", 2018, 60500,12300);

        System.out.println(Coche.fabricante +"\n"+ Coche.modelo +"\n" + Coche.year +"\n" + Coche.km +"\n" + Coche.precio);
    }
}

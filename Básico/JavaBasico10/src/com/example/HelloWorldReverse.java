package com.example;

public class HelloWorldReverse {
    public static void main(String[] args) {
        String hola = ("Hola Mundo");

        StringBuilder stringBuilder = new StringBuilder(hola);

        String invertido = stringBuilder.reverse().toString();
        System.out.println(invertido);

    }
}

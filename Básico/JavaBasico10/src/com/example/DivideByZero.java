package com.example;

import java.io.IOException;

public class DivideByZero {
    public static void main(String[] args) {
        try{
            DividePorCero(4,4);
        } catch(Exception e){
            System.out.println("Esto no puede hacerse");
        }
        System.out.println("Demo de código");

    }

    public static void DividePorCero(int A, int B) throws ArithmeticException, IOException {
       int result = 0;
       try {
           result = A / B;
       } catch (ArithmeticException e) {
           throw new IOException();
       }

        }

    }


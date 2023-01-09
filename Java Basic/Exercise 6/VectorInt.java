package com.example;

import java.util.Vector;

public class VectorInt {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.remove(1);
        numbers.remove(1);

        System.out.println(numbers);
    }
}

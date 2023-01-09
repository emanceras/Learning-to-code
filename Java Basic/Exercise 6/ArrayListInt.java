package com.example;

import java.util.ArrayList;

public class ArrayListInt {
    public static void main(String[] args) {
        int number = 10;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            list.add(i);
        }
        for(int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) % 2 == 0)
                list.remove(i);
            System.out.println(list.get(i));
        }
    }
}

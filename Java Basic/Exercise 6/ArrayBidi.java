package com.example;

import java.util.Arrays;

public class ArrayBidi {
    public static void main(String[] args) {
        int[][] array2 = new int[3][2];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[1][0] = 3;
        array2[1][1] = 4;
        array2[2][0] = 5;
        array2[2][1] = 6;

        for (int i = 0; i < array2.length; i++) {
            System.out.println(Arrays.toString(array2[i]));
        }
    }
}

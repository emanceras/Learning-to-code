package com.example;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class CopiaPega {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("abc");
            byte[] data = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream("destino.txt");
            out.print(Arrays.toString(data));
            out.close();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

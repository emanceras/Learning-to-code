package com.example;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListToLinkedList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add(String.valueOf(list));

        System.out.println("Esto es el ArrayList:" + list);
        System.out.println("Esto es el LinkedList:" + linkedList);
    }
}

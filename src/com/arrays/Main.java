package com.arrays;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(80);


        System.out.println(numbers.maxValue());
        numbers.print();

//        Dynamic arrays using ArrayList class
        ArrayList<Integer> list = new ArrayList<>();
//        add items
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

//        remove items
        list.remove(2);

//     other   methods
        list.indexOf(10);
        list.lastIndexOf(30);
        list.contains(50);
        list.size();
        list.toArray(); // converts a list to a regular array


    }
}

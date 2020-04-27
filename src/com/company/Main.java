package com.company;

public class Main {

    public static void main(String[] args) {
        HighArray arr;
        arr = new HighArray(10);
        arr.insert(10);
        arr.insert(6);
        arr.insert(2200);
        arr.insert(2);
        arr.insert(20);
        arr.insert(50);
        arr.insert(65);
        arr.insert(2100);

        System.out.println(arr.getMax());
        System.out.println(arr.removeMax());
        arr.display();
    }
}

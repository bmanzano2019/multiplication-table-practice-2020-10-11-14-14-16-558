package com.tw;

public class Main {
    public static void main (String[] args) {
        MultiplicationTable table = new MultiplicationTable();

        System.out.println(table.create(2, 4));
        System.out.println(table.create(1, 1));
        System.out.println(table.create(6, 5));

    }
}

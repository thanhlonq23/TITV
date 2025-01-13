package com.nguyenthanhlong;// Replace ___ with your code
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // create an Arraylist of String type
        ArrayList<String> names = new ArrayList<>();

        // add John to Arraylist
        names.add("John");

        // add Harry to Arraylist
        names.add("Harry");

        // take input from the user
        Scanner input = new Scanner(System.in);
        String name1 = input.next();

        // add name1 at index 1
        names.add(1,name1);

        // print the Arraylist
        System.out.print(names);

        input.close();
    }
}
package com.bridgelabz;

import java.util.Scanner;

// 1.3 = Write a program to check two strings are equal or not.

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  string 1");
        String name1 = sc.next();
        System.out.println("Enter string 2 ");
        String name2 = sc.next();
        char input = sc.next().charAt(0);

        if (name1.equals(name2)) { // if we use == in place of .equals then we get different results.
            System.out.println("Two Strings are equal.");
        } else {
            System.out.println("Two Strings are not equal");
        }
    }

}

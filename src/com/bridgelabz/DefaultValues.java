package com.bridgelabz;

// 1.2 = Write a Java program to display the default value of all primitive data types of Java.
public class DefaultValues {
    byte b ;
    long a;
    short s;
    int i;
    char c;
    boolean bo;
    float f;
    double d;

    public static void main(String[] args) {
        DefaultValues def = new DefaultValues();
        System.out.println("Default Value of byte is ="+ def.b);
        System.out.println("Default Value of long is ="+ def.a);
        System.out.println("Default Value of short is ="+ def.s);
        System.out.println("Default Value of int is ="+ def.i);
        System.out.println("Default Value of char is ="+ def.c);
        System.out.println("Default Value of boolean is ="+ def.bo);
        System.out.println("Default Value of float is ="+ def.f);
        System.out.println("Default Value of double is ="+ def.d);
    }
}

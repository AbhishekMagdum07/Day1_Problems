package com.bridgelabz;

public class Static {
    static int a = 3;
    static int b;

    static void demo(int x) {
        System.out.println(x);
        System.out.println(a);
        System.out.println(b);
    }
    static {
        b = a * 4;
    }
    public static void main(String args[]) {
        demo(42);
    }

}

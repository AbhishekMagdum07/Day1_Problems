package com.bridgelabz;

//To find the sum of command-line arguments and count the invalid integers entered.
public class SumOfCommandLine {
    public static void main(String args[]) {
        int a,b,c;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = a + b ;
        System.out.println("Sum of two commandline arguments = "+ c);
    }
}

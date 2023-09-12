package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int mod = a%2;
        if (mod == 0 ) {
//            we can change the condition to mod!= 0 and print odd in if condition and even in else condition
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
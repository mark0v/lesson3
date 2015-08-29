package com.mjava.lesson3;


import java.util.Scanner;

public class Main {

        public static final int MAX_DIGITS = 10;
        public static void main (String[] args){

        System.out.println("Home Work 1: Task 1. ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firs var: ");
        int q = scanner.nextInt();
        System.out.println("Enter second var: ");
        int w = scanner.nextInt();
        Data data = new Data();
        data.setQ(q);
        data.setW(w);
        data.setResDiv(q / w);
        data.setLeft(q % w);
        //System.out.println(data);
        System.out.println(q + "/" + w + " = " + data.getResDiv() + " and " + data.getLeft() + " left. " );
        System.out.println("---------------------------------------------");
        System.out.println("Home Work 1: Task 2 and 4. ");

        System.out.println("Enter digits that will be sum. Maximum allowed value: 999999999 ");
        int n = scanner.nextInt();

        if (n<=999999999){
            int [] a = new int[MAX_DIGITS];
            int tmp = 0;
            for (int i = MAX_DIGITS - 1; i >= 0; i-- ){
                a[i] = n % 10;
                n /= 10;
                tmp +=a[i];
            }
            System.out.println(tmp);
        }   else {
            System.out.println("Your enter very big value. Try Again.");

        }

            System.out.println("---------------------------------------------");
            System.out.println("Home Work 1: Task 3.%n Enter digits and the program round it.");
            System.out.println("Enter digits and the program round it.");

            float r = scanner.nextFloat();

            System.out.println( "Roud: " + Math.round(r));
    }
}


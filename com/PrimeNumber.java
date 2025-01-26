package com;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            
            if (num <= 1) {
                System.out.println("Number is not prime");
            } else {
                boolean isPrime = true;
                
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
                
                if (isPrime) {
                    System.out.println("Number is prime");
                } else {
                    System.out.println("Number is not prime");
                }
            }
        }
    }
}

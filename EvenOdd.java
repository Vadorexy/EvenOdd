package com.javacourse;

import java.util.Scanner;

public class EvenOdd {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter an integer or whole number ? ");
            int number = input.nextInt();

            double divisibleByTwo = number % 2;

            if(divisibleByTwo == 0)
                System.out.println("The integer entered is even.");
            else
                System.out.println("The integer entered is odd.");
        }
}

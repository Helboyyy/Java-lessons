package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int first, second = 100;
        int myNumber = 13;
        boolean isTrue = false;
        System.out.print("Enter first number: ");
        first = num.nextInt();

        isTrue = first == 99;
        /*Also u can write like this: isTrue = first == 99 ?(then/true) true :(else) false;(but it's unnecessary if type
        is boolean). This is short version of "if" and "else" expression. */

        if (first >= second || isTrue) { //The same with <, >=, <=, ==. && - and, || - or.
            System.out.println("Your number more or equal 100, or you found a secret number :)");
            System.out.print("\n"); //New string

            System.out.println("You're guessed my favourite number - " + myNumber + " :D");
        } else {
            System.out.println("Your number less than " + second);
        }

        switch (first) { //This conditional operator equals to "if/else" construction
            case 10: //Case - "different conditions of if". System.out.println("Your number is 10");
                break; //Break is important!
            case 20:
                System.out.println("Your number is 20");
                break;
            case 30:
                System.out.println("Your number is 30");
                break;
            case 123:
                System.out.println("Your number is 123");
                break;
            default: //The same as else operator. Doesn't need "break".
                System.out.println("I LIKE THANOS CAR");
        }
    }
}

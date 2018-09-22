package com.company;
import java.util.Scanner; //For user's input

public class Main {

    public static void main(String[] args) {
        System.out.println("Input something.");
        Scanner str = new Scanner(System.in);
        System.out.println("Your string is: " + str.nextLine ()); //str.nextLine important! Not just str.
    }
}

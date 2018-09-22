package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Float first, second, result;
        System.out.print("Enter first number: ");
        first = num.nextFloat();
        System.out.print("Enter second number: ");
        second = num.nextFloat();
        result = first + second; //The same with -, /, * and % - the remainder in the division (Остаток при делении)
        result /= 2; //The same with other operations
        result++; //It's equal to result = result + 1 (the same with --)
        System.out.println("Result is " + result);
    }
}

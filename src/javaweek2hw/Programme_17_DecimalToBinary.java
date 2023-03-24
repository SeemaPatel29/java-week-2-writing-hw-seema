package javaweek2hw;

import java.util.Scanner;

/*
17. Write a Java program to convert a decimal number to binary number.

Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        //scanner decalartion for reading input from the console
        System.out.println("Welcome to java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number");
        int  number = scanner.nextInt();
        convertDecimalToBinary(number);
        //closing scanner
        scanner.close();

    }
    //converting the decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary value is : " + binary);
    }
}

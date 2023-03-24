package javaweek2hw;

import java.util.Scanner;

/*
16. Write a Java program to add two binary numbers.

Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:

Sum of two binary numbers: 101
 */
public class Programme_16_AddTwoBinary {
    public static void main(String[] args) {
        System.out.println("Welcome tp java program to add two binary numbers");
        //scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first binary number");
        String first = scanner.nextLine();
        System.out.println("Please enter second binary number");
        String second = scanner.nextLine();
        String addition = addTwoBinaryNumber(first, second);
        System.out.println("The addition od two binary number is : " + addition);
        //closing scanner
        scanner.close();
    }
    //Adding the two binary numbers
    public static String addTwoBinaryNumber(String first, String second){
        //int b1 = integer.parseint(first,2);
        //int b2 = integer.parseint(second,2);
       // int sum = b1 + b2;
        //return integer.toBinaryString(sum);
        int b1 = Integer.parseInt(first, 2);
        int b2 = Integer.parseInt(second, 2);
        int sum = b1 + b2;
        //String binary = Integer.toBinaryString(sum);
        return Integer.toBinaryString(sum);
    }

}

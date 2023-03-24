package javaweek2hw;
/*
18. Write a Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

import java.util.Scanner;

public class Programme_18_PrintOperation {
    public static void main(String[] args) {
        //scanner declaration for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number : ");
        int firstNumber = scanner.nextInt();
        System.out.println("Please enter the second number : ");
        int secondNumber = scanner.nextInt();
        Programme_18_PrintOperation printOperation = new Programme_18_PrintOperation();
        printOperation.printTheOperation(firstNumber, secondNumber);
        //scanner closing
        scanner.close();

    }
    //printing all operations
    public void printTheOperation(int a, int b){
        System.out.println("The Sum of " + a + " and " + b + " is " + (a+b) );
        System.out.println("The Difference of "+ a + " and " + b + " is " + (a-b));
        System.out.println("The Product of "+ a + " and " + b + " is " + (a*b) );
        System.out.println("The Division of "+ a + " and " + b + " is " + (a/b)  );
        System.out.println("The Remainder of" + a + " and " + b + " is " + (a%b));
    }
}

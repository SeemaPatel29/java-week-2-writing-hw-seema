package javaweek2hw;

import java.util.Scanner;

/*
13. Write a Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */
public class Programme_13_AverageOfNumbers {
    public static void main(String[] args) {
        //scanner decalartion for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double x = scanner.nextDouble();
        System.out.println("Enter the second number :");
        double y = scanner.nextDouble();
        System.out.println("Enter the third number :");
        double z = scanner.nextDouble();
        avergeOfThreeNumbers(x,y,z);
        //closing scanner
        scanner.close();
    }
    public static void avergeOfThreeNumbers(double a,double b, double c){
        double average = (a+b+c)/3;
        System.out.println("The average of " + a + ", " + b + " and " + c + " is : " + average);
    }
}

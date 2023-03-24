package javaweek2hw;

import java.util.Scanner;

/*
9. Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        //Scanner decalration for reading input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        //closing the scanner object.
        scanner.close();
    }
    //Conversion of Uppercase to Lower case method
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}

package javaweek2hw;

import java.util.Scanner;

/*
15. Write a Java program to swap two variables.
 */
public class Programme_15_SwapTheValue {
    public static void main(String[] args) {
        //scanner declaration fpr reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first variable value :");
        int first =scanner.nextInt();
        System.out.println("Enter the second variable value : ");
        int second = scanner.nextInt();
        Programme_15_SwapTheValue t = new Programme_15_SwapTheValue();
        t.swapTheValue(first , second);
        //closing scanner
        scanner.close();
    }
    //swaping the value of variable
    public void swapTheValue(int a, int b){
        int c;
        System.out.println("Before the swapping, The values of first variable is :" + a + " and second variable is : " + b);
        c=a;
        a=b;
        b=c;
        System.out.println("After the swapping, The values of first variables is : " + a + " and second variable is : " + b);

    }
}

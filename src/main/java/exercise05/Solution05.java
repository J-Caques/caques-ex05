/*
   UCF COP3330 Fall 2021 Assignment 1 Solution
   Copyright 2021 Jonathan Caques
 */
package exercise05;

import java.util.Scanner;

public class Solution05 {
    /*
        Print "Enter 1st number: "
        Scanner input1 = new Scanner(System.in)
        String num1 = input1.next()
        Print "Enter 2nd number: "
        Scanner input2 = new Scanner(System.in)
        String num2 = input2.next()
        Convert num1 & num2 into int's
        Perform calculations (addition, subtraction, multiplication, division)
        Print output, creating a newline after each calculation:
            num1 + num2 = sum
            num1 - num2 = difference
            ....
     */
    public static void main(String[] args) {
        System.out.print("What is the first number?: ");
            Scanner input1 = new Scanner(System.in);
            String num1 = input1.next();
            float num01 = Integer.parseInt(num1);

        System.out.print("What is the second number?: ");
            Scanner input2 = new Scanner(System.in);
            String num2 = input2.next();
            float num02 = Integer.parseInt(num2);

        float sum = num01 + num02;
        float difference = num01 - num02;
        float product = num01 * num02;
        float quotient = num01 / num02;

        System.out.println(num1 + " + " + num2 + " = " + sum + "\n" + num1 + " - " + num2 + " = " + difference + "\n"
        + num1 + " * " + num2 + " = " + product + "\n" + num1 + " / " + num2 + " = " + quotient);


    }
}

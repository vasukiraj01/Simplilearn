package simplelearn;

//Java program for simple calculator

import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;
public class Arithmeticcalculator {

	public static void main(String[] args)
	{
		double num1, num2;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number");


		num1 = sc.nextDouble();
		System.out.println("Enter the number");
		num2 = sc.nextDouble();

		System.out.println("Enter the operator (+,-,*,/)");

		char op = sc.next().charAt(0);

		double o = 0;

		switch (op) {

		case '+':

			o = num1 + num2;

			break;

		case '-':

			o = num1 - num2;

			break;
			
		case '*':

			o = num1 * num2;

			break;

		case '/':
			if(num1!=0)
			o = num1 / num2;
			if(num1 == 0||num2 == 0)

			System.out.println("can't divide by zero ");
			System.out.println("\n");
			break;


		default:

			System.out.println("You enter wrong input");

			break;
		}

		System.out.println("The final result:");

		System.out.println();

		// print the final result
		System.out.printf(num1 + " " + op + " " + num2
						+ " = " + o,0.0f);
	}
}

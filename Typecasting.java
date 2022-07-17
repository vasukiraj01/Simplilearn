package simplelearn;

import java.util.Scanner;

public class Typecasting {

	public static void main(String[] args) { 
			//implicit conversion
			char a = 'V';
			System.out.println("Value of a : "+a);
			int i = a;
			System.out.println(i +" is the value of i");
			long l = a;
			System.out.println("Value of l "+l);
			float f = a;
			System.out.println("Value of f "+f);
			double d =f;
			System.out.println("Value of d "+d);
			System.out.println("\n");
			//explicit typecasting
			System.out.println("Give any number");
			try (Scanner sc = new Scanner(System.in)) {
				int A = sc.nextInt();
				char c = (char)A;
				System.out.println("The char of given integer is: "+c);
			}
	}
}

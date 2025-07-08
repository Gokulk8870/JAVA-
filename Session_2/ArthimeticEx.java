package Session_2;

import java.util.Scanner;

public class ArthimeticEx {
	

	public static void main(String[] args) {
//		int a=5,b=8; //direct initialization
//		BODMAS-->()/*+- ==>Bracket of divition Multiplication addition subtraction multiplication division
		
		Scanner sc=new Scanner(System.in); //user defined input
		System.out.println("enter the value a:");
		int a=sc.nextInt();
		System.out.println("enter the value b:");
		int b=sc.nextInt();
		
		
		System.out.println("Addition :"+(a+b));
		System.out.println("Subtraction :"+(a-b));
		System.out.println("Multiplication :"+(a*b));
		System.out.println("Divition :"+(a/b));
		System.out.println("Modules :"+(a%b));

	}

}

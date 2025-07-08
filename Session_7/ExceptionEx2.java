package Session_7;

import java.util.Scanner;

public class ExceptionEx2 {
	public static void main(String[] args) {
		//arthmeticexception
		
		//mismatchException
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("enter the 1st number:");
			int num1=sc.nextInt();
			System.out.println("enter the 2st number:");
			int num2=sc.nextInt();
			int result=num1/num2;
			System.out.println("the result is :"+result);
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println("divide by zero");
		}
		catch(Exception e) {
			System.out.println("Give the correct input value:"+e.getMessage());
			e.printStackTrace();
		}
		
	}
}
	
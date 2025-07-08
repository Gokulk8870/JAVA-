package Session_7;

import java.util.Scanner;

public class ExceptionEx1 {
	public static void main(String[] args) {
		
		//numberformatexception
		int num1,num2,result;
		String snum1,snum2;
		Scanner sc=new Scanner(System.in);
		try {
			
			/**
			 * code to execute condition
			 */
			
			System.out.println("Enter the 1 st number:");
			snum1=sc.next();
			System.out.println("Enter the 2 st number:");
			snum2=sc.next();
			num1=Integer.parseInt(snum1);
			num2=Integer.parseInt(snum2);
			result=num1+num2;
			
			System.out.println("the result is :"+result);
			
		}
		catch(Exception e) {
			
			/**
			 * 
			 * catch exception and show as msg
			 */
			System.out.println("Exceptionn message"+e.getMessage());
			e.printStackTrace();
			 
		}
		
	}
}

package Session_7;

import java.util.Scanner;

public class ValidateCustomerAge extends AgeException {
	public static void main(String[] args) {
		int age;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age:");
		age=sc.nextInt();
		if(age<=0) {
			try {
				throw new AgeException();
			}
			catch(AgeException e) {
				
			}
		}
		
		else {
				System.out.println("age entered is:"+age);
			}
		
	}
}

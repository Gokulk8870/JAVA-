package Session_2;

import java.util.Scanner;

public class Scannerex{
	public static void main(String[] args) {
		/**
		 * int -->nextInt()
		 * float -->nextFloat()
		 * double -->nextDouble();
		 * long
		 * String-->next()-->use single word,nextLine()-->use mutliple words;
		 * 
		 * 
		 */
		
		System.out.println("1.Emp-name");
		System.out.println("2.Emp-id");
		System.out.println("3.Emp-Address");
		System.out.println("4.Emp-dept");
		System.out.println("5.Emp-Exp");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ur name:");
		String name=sc.nextLine();
		
		System.out.println("Enter your id:");
		int id=sc.nextInt();
		
		sc.nextLine();
		
	    System.out.println("enter your adddress");
	    String addr=sc.nextLine();
	    
	    System.out.println("enter your department:");
	    String dept=sc.nextLine();
	    
	    System.out.println("enter your Experience");
	    double exp=sc.nextDouble();
		System.out.println(name+" | "+id+" | "+addr+" | "+dept+" | "+exp);
		
	}
}

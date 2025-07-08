package Session_2;

import java.util.Scanner;

public class NestedIf {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("****Blood Donation*****");
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("enter your weight");
		int weight=sc.nextInt();

		if(age>18) {
			if(age>=18 && age<50 && weight>50) {
				System.out.println("can donate blood");
			}
			else {
				System.out.println("age and weight not under criteria");
			}
		}
		else {
			System.out.println("age must be above 18");
		}
		
	}
}

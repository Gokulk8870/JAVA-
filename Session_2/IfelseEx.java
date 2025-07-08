package Session_2;

import java.util.Scanner;

public class IfelseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age:");
		int age=sc.nextInt();
		if(age>20) {
			System.out.println("elligible for vote");
		}
		else {
			System.out.println("not elligible for vote");
		}

	}

}

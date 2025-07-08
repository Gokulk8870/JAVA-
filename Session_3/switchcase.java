package Session_3;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Select ur language:");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your choice(1 to 4):");
		int ch=sc.nextInt();
		
//		string role=sc.next();
		
		switch(ch) { //instead ch use role
		case 1:
			System.out.println("tamil");   //1 ==> admin
			break;
		case 2:
			System.out.println("english"); //2 ==> tester
			break;
		case 3:
			System.out.println("hindi"); //3 ==> developer
			break;
		case 4:
			System.out.println("telugu"); //4 ==> hr
			break;
		default:
			System.out.println("Invalid enter correct choice");
		}
		

	}

}

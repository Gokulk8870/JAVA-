package Session_2;

import java.util.Scanner;

public class ElseifLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the ticket price:");
		int price=sc.nextInt();
		if(price>60 && price<=120) {
			System.out.println("seat from 0 to 30");
		}
		else if(price>121 && price<=180){
			System.out.println("seat from 31 to 60");
		}
		else if(price>181 && price<=300){
			System.out.println("seat from 61 to 120");
			
		}
		else if(price>301){
			System.out.println("special cabin");
		}
		else {
			System.out.println("Invalid value");
		}
		
		

	}

}

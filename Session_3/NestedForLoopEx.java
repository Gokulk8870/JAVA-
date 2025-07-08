package Session_3;

import java.util.Scanner;

public class NestedForLoopEx {
	public static void main(String[] args) {
		
		/**
		 * 
		 * 					column
		 * 				0	 1	     2
		 * row==>0==>25(0,0) 5(0,1) 36(0,2)
		 * 		 1==>12(1,0) 4(1,1) 75
		 * 		 2==>
		 * 
		 * 
		 * 
		 * 
		 */
		
		//pattern 1
		/*for (int i=1;i<=5;i++) { //1 to 5 ==>row
			for(int j=1;j<=5;j++) { //1 to 5==> col
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
		
		//pattern 2
		
		/*for(int i=1;i<=5;i++) {  // i=1,2,3
			for(int j=1;j<i+1;j++) {//j=1,2,3,4
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}*/
	
	
//	pattern2  ==>Inverted right angled triangle
//	int num=6;
//	for(int i=0;i<=num;i++) {
//		for(int j=1;j<=num-i;j++) {
//			System.out.print(j+" ");
//		}
//		System.out.println();
//	}
//	
	//pattern 4==>Diamond pattern
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no.of rows:");
	int rows=sc.nextInt(); //5
	//top half of the diamond
	for(int i=1;i<=rows;i++) {      //i=1 i=2 i=3 i=4 i=5 i<=5
		//print leading spaces
		for(int j=i;j<rows;j++) {   //j=1 j=2 j=3 j=4 j<5
			System.out.print(" ");     
//			j=1 4 spaces  
//			j=2 3 spaces
//			j=3 2 spaces 
//			j=4 1 spaces
			
		}
		//print stars 
		for(int k=1;k<=(2*i-1);k++) {   
			System.out.print("*");
		}
		System.out.println();
	}
	
	/**
	 * BODMAS -->RULE
	 * k=1 k<=2*1-1==>2-1=1   							*
	 * k=2 k<=2*2-1==>4-1=3				
	 * k=3 k<=2*3-1==>6-1=5
	 * k=4 k<=2*4-1==>8-1=7
	 * k=5 k<=2*5-1==>10-1=9
	 * 
	 */
	//bottom 
	
	for(int i=rows-1;i>=1;i--) {
		//print leading spaces
		for(int j=rows;j>i;j--) {
			System.out.print(" ");
			
		}
		//print stars 
		for(int k=1;k<=(2*i-1);k++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
}
}

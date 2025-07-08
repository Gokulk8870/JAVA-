package Session_2;

//import java.util.Scanner;

public class pratice {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter your name");
//		
//		String name=sc.next();
//		System.out.println("Your name is:"+name);
//	
//		int a=16,b=5;

		/**
		 * 12
		 * 16 8 4 2 1
		 * 
		 * NOT -(n+1)
		 * 0  1 1 0 0
		 * 0  0 0 0 1
		 * -----------
		 * 0  1 1 0  1==>NOT OPEARTION ON BIT wise operation
		 * 
		 * ==-13
		 * 
		 * 0  1 1 0 0
		 * 0  1 0 0 0
		 * -----------
		 * 0  0 1 0 0==>XOR OPERATION ON BITWISE OPERATION
		 * 
		 * =4
		 * 
		 * 0  1 0 0 0 ==>AND OPERATION ON BITWISE OPERATOR
		 * 
		 * = 8
		 * 
		 * 0  1 1 0 0 ==>Or OPERATION ON BIT WISE OPERATOR
		 * 
		 * =12
		 * 
		 */
		/**System.out.println("Bit wise Operation:"+ "AND "+(a & b)+" OR "+(a | b)+ " NOT "+(~a)+ " XOR "+(a ^ b));
		
		
		System.out.println("Shift operator");
		
		int c=10, d=5;
		
		System.out.println("right shift >>"+(c>>d));
		System.out.println("left shift <<"+(c<<d));
		*/
		/**
		 * >>(10>>5)
		 * 
		 * 10/2*5
		 * 
		 * 15/10=5
		 * 
		 * 10*2^5
		 * 
		 * 2*2*2*2*2
		 * 4*4*2
		 * 32
		 * 320
		
		 * 
		 * 
		 * 
		 */
		
		
		        int[] values = {2, 4, 6, 8, 10};
		        int total = 0;

		        for (int i = 0; i < values.length - 1; i++) {
		            total += values[i]++ + values[++i];
		            System.out.println(total);
		        }

		        System.out.println("total = " + total);
		        System.out.print("values = ");
		        for (int v : values) {
		            System.out.print(v + " ");
		        }
		
		 
		
	}

}

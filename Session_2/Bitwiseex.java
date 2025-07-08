package Session_2;

public class Bitwiseex {
	public static void main(String[] args) {
		int a=5,b=3;
		
		/**
		 * Binary --> 0 and 1
		 * 
		 * 8 4 2 1	==>8 bit format
		 * 
		 *
		 * 0 1 0 1 ==>5
		 * 0 0 1 1 ==>3
		 * ------------
		 * 0 1 1 1 ==>7 ==>Bitwise Or
		 * ------------
		 * 
		 * 0 1 0 1
		 * 0 0 1 1
		 * --------
		 * 0 0 0 1==>1==>Btwise AND
		 * --------
		 * 
		 * formula==>-(n+1)
		 *     1
		 * 0 1 0 1 ==>5
		 * +
		 * 0 0 0 1 ==>1
		 * ------------
		 * 0 1 1 0 ==>-6 ==>Bitwise Not
		 * ------------
		 * 
		 * XOR =>Or Opposite
		 * 
		 * 0 1 0 1
		 * 0 0 1 1
		 * ---------
		 * 0 1 1 0 ==>6 ==>Bitwise XOR
		 * --------
		 * 
		 * 16 8 4 2 1 ==>hexa==>16 bit
		 * 
		 * 32 16 8 4 2 1 ==> 32 bit
		 * 
		 * 64 32 16 8 4 2 1 ==>64 bit
		 * 
		 
		 *  
		 */
		System.out.println("Bitwise Or:"+(a | b));
		System.out.println("Bitwise AND:"+(a & b));
		System.out.println("Bitwise not:"+(~a));
		System.out.println("Bitwise XOR:"+(a ^ b));
	}
}

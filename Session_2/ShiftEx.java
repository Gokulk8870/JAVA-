package Session_2;

public class ShiftEx {

	public static void main(String[] args) {
		
		System.out.println(5>>2); //right shift ==>formula ->5/2*2 ==>5/4=1
		
		System.out.println(5<<2); //left shift ==>formula ->5*2^2=>5*4=20
		
		/**
		 * 
		 * 
		 * 5>>2
		 * 5=>0101
		 * 
		 * -->0 1 0 1 
		 * -->0 0 1 0 ==> 1 st shift
		 * -->0 0 0 1 ==> 2 st shift
		 * -->8 4 2 1 ==> 1
		 * 
		 * 5<<2
		 * 
		 * 
		 * -->0  0 1 0 1
		 * -->0  1 0 1 0==> 1st shift
		 * -->1  0 1 0 0==> 2 st shift
		 * 	  16 8 4 2 1 ==>20
		 * 
		 *  
		 */

	}

}

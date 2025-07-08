package Session_4;

public class StringLiteralEx {

	public static void main(String[] args) {
		
		
		String s1="Hello ";
		String s2="Hello ";
		String s3="World";
		String s4=s1+s3;
 		s1=s1+s3; //+-->Concatenation
		
		/**
		 * 2 Types of memory to store String Values:
		 * 
		 * -->SCP-->STRING Constant Pool-->String literal data stored 
		 * -->Heap Memory
		 * 
		 * 
		 */
		
		//compare 2 stringliteral using == operator
		System.out.println(s1==s2); //false 
		
		System.out.println("the data stored in s4:"+s4);
		
		System.out.println("to concat 2 strings:"+s1); //Hello World

	}

}

package Session_2;

public class Logicalex {
	public static void main(String[] args) {
		boolean condition1=true,condition2=false;
		System.out.println("Logica AND :"+(condition1&&condition2));
		System.out.println("Logica OR :"+(condition1 || condition2));
		System.out.println("Logica NOT :"+(!condition1));
		
		/**
		 * LogicaL AND ==>multiplication
		 * 
		 * opearnd1		operand2		output
		 * 
		 * 		0			0				0
		 * 		0			1				0
		 * 		1			0				0
		 * 		1			1				1
		 * 
		 * LogicaL 	OR ==>Addition
		 * 
		 * opearnd1		operand2		output
		 * 
		 * 		0			0				0
		 * 		0			1				1
		 * 		1			0				1
		 * 		1			1				1
		 * 
		 * LogicaL NOT ==>negation 
		 * 
		 * opearnd1		output
		 * 				
		 * 		0			1				
		 * 		1			0				(1 True 0 false)	
		 * 
		 * (RW comparing addition and OR,multiplication and AND,negation and NOT)		
		 */
		
	}
}

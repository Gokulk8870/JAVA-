package Session_2;

import java.util.Scanner;

public class Unaryoperator {
	

	public static void main(String[] args) {
		int a=10,b=8,c;
		/*//negative
		System.out.println("negative"+(-a));
		//positive
		System.out.println("positive"+(+a));*/ 
		
		c=a++ + ++a + --a - a-- + b++ + --b - --b + ++b;
/**
 *         10   + 12 + 11 - 11+8+8-7+8
 *         10+12+11-11+8+8-7+8
 *         10+12+9+8
 *         39
 *         
 *        b=7
 *        a=10
 *        a= 11
 */
//		10+12+11 - 11+8+8-7+8   //22+16
		System.out.println("the result  c:"+c);
		
	}
}

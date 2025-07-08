package Session_7;

public class ExceptionEx4 {
	
	public static void checkNum(int num) {
		if(num<1) {
			throw new ArithmeticException("\n Number is negative or Zero can't calculate squre");
		}
		else {
			System.out.println("Squre of "+num+" is "+(num*num));
		}
	}
	public static void main(String[] args) {
		checkNum(5);
	}
}

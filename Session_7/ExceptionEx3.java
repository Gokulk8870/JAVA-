package Session_7;

public class ExceptionEx3 {
	public static void main(String[] args) {
		try {
			//outer block
			int[] numbers= {1,2,3};
			int a=numbers[4];
			System.out.println("a :"+a);
			
				try {
				
					//inner block
					int b=numbers[2];  //ArrayIndexOutOfBoundsException
					System.out.println("b :"+b);
					
				}
				catch(ArrayIndexOutOfBoundsException  e) {
					System.out.println("Inner block Exception caught: "+e.getMessage());
					e.printStackTrace();
				}
		}
		catch(Exception e) {
			//outer catch block
			System.out.println("Outer block Exception caught: "+e.getMessage());
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Block Executed........Cleaning Resources");
		}
	}
}

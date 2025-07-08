
public class Variable {
	int a; /* variable declare*/
	float f=35.890f; //variable intialization //instance variable
	static int b=35;
//	single memory 
	/**
	 * 
	 * 
	 * variable types
	 * 1 instance variable
	 * 2 static variable
	 * 3 local variable
	 * 
	 *
	 * 
	 */
	static void display() {
		double d=58.994884; //local vatiable
		System.out.println(d);
	}
	public int value() {
		int c=25;
		System.out.println(c);
		return c;
	}


	public static void main(String[] args) {
		System.out.println(b);  
//		static variable direct access
		
		display();
		Variable1.name();
		/**
		 * non static need to access through object of the class
		 * (if its declared in same class or other class)
		 * 
		 * static method or variable can be access directly if its inside class
		 * 
		 * if static method or variable are declared  in another class means 
		 * need to access through class name
		 * 
		 * -->static method and variable can be accessed through class object but its showing warning
		 * 
		 */
		
		Variable var=new Variable();
		System.out.println(var.f);
		var.value();
		
		Variable1 obj=new Variable1();
		obj.print();
		
		
	}

}

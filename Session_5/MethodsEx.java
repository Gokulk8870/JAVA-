package Session_5;

public class MethodsEx {
	
	/**
	 * 
	 * Definition:
	 * -->A method is a block of code (or) collections of statemnts,(or) a set 
	 * of cose grouped together to perform certain task or operation
	 * 
	 * Uses:
	 * 
	 * -->To write a method once anduse it many times 
	 * -->Provide easy modification and readability
	 * -->Provide easy modification and readablity
	 * -->the method is executed only when we call or invoke it
	 * 
	 * 2) types of methods
	 * 1.User-defined method
	 * 2.Bulit -in method (or) Standared library method (or)pe-defined method
		 * 
	 * Syntax:
	 * Public int sun(int a,int b){      
	 * 		//method body
	 * 
	 * }
	 * Public int sum(int a,int b)-->Method Header
	 * public-->access specifier
	 * int-->return type
	 * sum-->method name
	 * (int a,int b)-->parameter list
	 * int a==> Argument
	 * sum(int a,int b)-->method signature
	 * 
	 * 
	 * ---Note----
	 * ==>If value not passed means its called argument
	 * ==>if the value passed for the argument means its called parameter 
	 */
	
	
	String name;  //variable declaration
	int rollno;  
	
	void display() { //non-parameterized method or default
		System.out.println("<---Default Method -->");
		System.out.println("name:"+name);
		System.out.println("roll-no:"+rollno);
	}
	void print(String name,int rollno) {
		System.out.println("<---Parametrizd method--->");
		System.out.println("Name:"+name);
		System.out.println("Roll-no:"+rollno);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsEx me=new MethodsEx();
		me.display();
		me.print("Gokul", 678883);
	}

}

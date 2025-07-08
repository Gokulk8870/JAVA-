package Session_5;

public class ConstructorEx {
	/**
	 * 
	 * Definition:
	 * -->Constructor is a block of code similar to meythod
	 * -->constructor as method has class name
	 * 
	 * Usage:
	 * ******another name of object (instance)
	 * -->It is called when the instance(object) of the class is created
	 * -->at the time of caling constructor, memory for the object is allocated in the memory of constructor
	 * 
	 * -->Every time an object is created using new() Keyword ,atleast one ,constructor is called
	 * 
	 * 2 types of constructor:
	 * 
	 * 1)Non-parameterized Constructor(No-arguments) or Default Arguments
	 * 2)Parameterized constructor (with arguments)
	 */
	String location;
	int zipcode;
	
	ConstructorEx(){
		System.out.println("Default constructor");
		location="Sathy";
		zipcode=638401;
		
	}
	
	ConstructorEx(String name,int age){
		System.out.println("Parameterized Constructor");
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		
	}void displayInfo(){
		System.out.println("location :"+location);
		System.out.println("Zipcode :"+zipcode);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorEx ce=new ConstructorEx();   //call an default constructor
		ConstructorEx ce2=new ConstructorEx("GOKUL",20);
		ce.displayInfo();
	}
}

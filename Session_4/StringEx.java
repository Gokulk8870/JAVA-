package Session_4;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * String-->non primitive datatype
		 * It is immutable(unchangeable)
		 * 
		 * Initialization can be done in 2 ways:
		 * 
		 * 1.String literal
		 * 2.String Object
		 * 
		 */
		
		//1.String Literal
		String name="Gokul"; //name-->string  reference variable
		System.out.println("Literal Object:"+name);
		
		//2.String Object
		String name1=new String("Gokul");
		System.out.println("String Object:"+name1);
		
		char ch[]= {'g','o','k','u','l'};
		String info=new String(ch);
		System.out.println("char array to string: "+info);
		
		

	}

}

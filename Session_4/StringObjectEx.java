package Session_4;

public class StringObjectEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String Object
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		String s3=new String("World");
		
		/*
		 * 
		 * 2 types of memory to store String Object 
		 * -->SCP-->String Contant pool -->1 Copy stored in scp
		 * -->heap memory -->another copy stored here
		 * 
		 * SCP:
		 * -->SCP did not have duplicate value
		 * -->String reference variable point the value if its been same data in store in another reference variable
		 * 
		 * Heap Memory
		 * 
		 * -->Heap Memory can have duplicate value
		 */
		
		//compare 2 string object using == operator
		System.out.println("Before modifying s1:"+(s1==s2));
		
		
		String s4=s1+s3;
		s1=s1+s3;
		
		System.out.println("the data stored in s4:"+s4); //Hello World
		
		System.out.println("After modifying s1:"+s1); //Hello World

	}

}

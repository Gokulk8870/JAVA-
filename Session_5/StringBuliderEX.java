package Session_5;

public class StringBuliderEX {
	private static final String StringBulider = null;

	public static void main(String[] args) {
		/**
		 * 
		 * Important Methods:
		 * 
		 *-->append(String str)
		 *-->insert(int oofset,String str)
		 *-->replace(int start,int end,String str)
		 *-->reverse()
		 */
		
//		StringBuilder sb=new StringBuilder("Hello"); //jdk 1.5 
		StringBuffer sb=new StringBuffer("Hello");	//jdk 1.0
		//append
		sb.append("word");
		System.out.println("After Append: "+sb);  //HelloWorld
		
		//insert
		sb.insert(5, ",");
		System.out.println("After Insert:"+sb); //Hello,World
		
		//Replace
		sb.replace(6,11, "Java");
		System.out.println("after replace:"+sb); //Hello,Java
		
		//Reverse
		
//		sb.reverse();
//	    System.out.println("Reverse:"+sb);   //avaj,olleh
//	    
	    //Delete
	    sb.delete(0, 6);
	    System.out.println("After Delete:"+sb);
	    
	    
	    
	    
	    
	    //Contains
	    String st="Java Program";   //works only on
	    System.out.println("Check string present or not :"+st.contains("Java")); //boolean format true or false
		
		
	}
}

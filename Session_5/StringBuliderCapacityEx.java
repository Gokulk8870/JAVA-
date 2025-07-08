package Session_5;

public class StringBuliderCapacityEx {
	public static void main(String[] args) {
		
	
		// TODO Auto-generated constructor stub
		
		StringBuilder sb=new StringBuilder();
		System.out.println("Default capacity:"+sb.capacity());  //default-16
		
		sb.append("java");
		System.out.println("After Appending capcity:"+sb.capacity()); //now 
		
		/**
		 * formula
		 * (old capacity*2)+2
		 * 
		 */
		
		sb.append("is a high -level program");
		System.out.println(sb.capacity()); //(16*2)+2=32+2=34
		
		sb.append("language");
		System.out.println(sb.capacity());  //(34*2)+2=68+2=>70
		
		
	}
}

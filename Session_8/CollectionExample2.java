package Session_8;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Class_NAME<>-->GENERIC CLASS
		 * METHOD_NAME<>-->GENERIC METHOD
		 * 
		 * 
		 * interating through collections
		 * 
		 * 2 ways to iterate
		 * 
		 * -->using for-each loop
		 * -->using iterator
		 * 
		 */
		
		ArrayList<String> names=new ArrayList<String>();
		names.add("gokul");
		names.add("vasanth");
		names.add("sudhesh");
		names.add("moses");
		
		System.out.println(names.get(2));  //return one value
		
		//1)for-eachloop
		System.out.println("-----using for each loop-----");
		
		//using for each loop
		for(String name:names) {
			System.out.println(name);
		}
		
		//using iterator
		Iterator<String> iterate=names.iterator();
		
		System.out.println("-----using iterator-----");
		while(iterate.hasNext()) {
			System.out.println(iterate.next());
		}
				
		

	}

}

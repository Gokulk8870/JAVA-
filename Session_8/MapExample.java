package Session_8;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		
		
		//create map
		HashMap<Integer,String> countryCodes=new HashMap<Integer,String>();
		countryCodes.put(1, "USA");
		countryCodes.put(91, "India");
		countryCodes.put(3, "UK");
		
		//display the map
		System.out.println("original map"+countryCodes);
		
		
		//update the value 
		countryCodes.put(91, "Bharat");
		System.out.println("after updateing india to bharat"+countryCodes);
		
		//remove an entry
		
		countryCodes.remove(44);
		System.out.println("after removing Uk"+countryCodes);
		
		//check if map contains a key
		System.out.println("contains key 9?"+countryCodes.containsKey(91));
		
		
		//display all keys 
		System.out.println("keys:"+countryCodes.keySet());
		
		
		//display all values
		System.out.println("values:"+countryCodes.values());
	}
}

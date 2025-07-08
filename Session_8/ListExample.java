package Session_8;

import java.util.ArrayList;

public class ListExample {
	public static void main(String[] args) {
		// create a list

		ArrayList<String> mobiles = new ArrayList<String>();
		mobiles.add("Samsung s24");
		mobiles.add("One plus 11");
		mobiles.add("Iphone 15 pro");

		// display the list
		System.out.println("orignal list " + mobiles);

		// add at specific index
		mobiles.add(2, "Oppo F23");
		System.out.println("after adding Oppo f23:" + mobiles);

		// update an element set

		mobiles.set(2, "Realme 15");
		System.out.println("after updateing realme 15:" + mobiles);

		// remove by value

		mobiles.remove("Iphone 15 pro");
		System.out.println("after removing iphone 15 pro" + mobiles);
		
		//check if the list contains the element 
		System.out.println("contains samsung s24?"+mobiles.contains("Samsung s24"));
		
		//get the size of the list
		
		System.out.println("size of list"+mobiles.size());
	}
}

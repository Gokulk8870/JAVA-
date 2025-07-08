package Session_3;

public class Array1DEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * two ways to initialize values
		 * 
		 * -->Directly Initialize elements to the array name
		 * -->provide size and then initialize elements
		 * 
		 * 
		 */
		
		
		//Direct Initialization
		String[] name= {"Gokul","Mohan","Mithun"};
		//accessing the element using index
		
		
		//access single element
		System.out.println("name :"+name[0]);
		
		
		/**
		 * Access all elements in array-->2 ways
		 * 1.using length in for loop
		 * 2.using for each loop(Enhanced for loop)
		 */
		System.out.println("1.1 Access all elements using for loop");
		
		//access all elements
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		
		System.out.println("1.2 Access all elements using for-each loop");

		for(String name1:name) {
			System.out.println(name1);
		}
		
		//2 provide size and make initialize elements
		int number[]=new int[5];
		number[0]=25;
		number[1]=23;
		number[2]=34;
		number[3]=78;
		number[4]=90;
		System.out.println("2.Access single element");
		System.out.println("number :"+number[3]);
		
		System.out.println("2.1 Access all elements using for loop");
		for(int j=0;j<number.length;j++) {
			System.out.println(number[j]);
		}
		
		System.out.println("2.2 Access all elements using for-each loop");
		System.out.println("for each loop output");
	  for(int a1:number) {
		  System.out.println(a1);
	  }	
		
		
	}

}

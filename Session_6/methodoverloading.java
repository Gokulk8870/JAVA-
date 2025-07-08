package Session_6;

public class methodoverloading {
	
	/**
	 * (compile time overloading)
	 * 2 ways to overload the method
	 * 
	 * -->by changing the number of arguments
	 * -->by changing the datatype
	 * 
	 */
	
	 int d;
	 
	 //by changing number arguments
	  public void add(int a,int b) {
		  
		  d=a+b;
		  System.out.println("the value of d is:"+d);
		  
	  }
	  public void add(int a,int b,int c) {
		  d=a+b+c;
		  System.out.println("the value of d is:"+d);
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodoverloading moe=new methodoverloading();
		
		moe.add(10, 20);
		moe.add(10, 20, 30);
		
		
	 

	}

}

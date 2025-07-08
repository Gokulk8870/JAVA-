package Session_5;

public class ConstructorOverloadingEx {
	private String name;  //instance variable
	private int regno;
	private String locatoin;
	
	public ConstructorOverloadingEx(String name,int regno,String locatoin){   
		this.name=name;  //this-->refer to the instance variable   //private variable convert to public       
		this.regno=regno;
		this.locatoin=locatoin;
	}
	
	/**
	 *--> Same constructor name and same number of argument and invoke the argument
	 */
	public ConstructorOverloadingEx(String name,String locatoin){   
		this(name,0,locatoin);
	}
	public ConstructorOverloadingEx(String name,int regno){   
		this(name,regno,null);
	}
	public void display() {
		System.out.println("name :"+this.name);
		System.out.println("regno :"+this.regno);
		System.out.println("location :"+this.locatoin);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ConstructorOverloadingEx co=new  ConstructorOverloadingEx("gokul",1234,"Sathy");
		 ConstructorOverloadingEx co1=new  ConstructorOverloadingEx("gokul",1234);
		 ConstructorOverloadingEx co2=new  ConstructorOverloadingEx("gokul","gobi");
		 co.display();
		 co1.display();
		 co2.display();
		 
		
		

	}

}

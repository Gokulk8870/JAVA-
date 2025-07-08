package Session_5;

public class CopyConstructorEX {
	/**
	 * -->There is no copy constructor in java
	 * -->However ,we can copy the values fro one object to another obeject
	 * like copy constructor in c++
	 * 
	 */
	
	
	private String name;
	private int age;
	
	
	//regular constructor
	public CopyConstructorEX(String name,int age) {
		
		this.name=name;
		this.age=age;
		
	}
	public CopyConstructorEX(CopyConstructorEX other) {
		this.name=other.name;
		this.age=other.age;
		
	}
	public void dsipaly() {
		System.out.println("name:"+name+","+"age:"+age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructorEX Original=new CopyConstructorEX("gokul",27);
		CopyConstructorEX Copy=new CopyConstructorEX(Original);
		
		System.out.println("*********Original Data***************");
		Original.dsipaly();
		System.out.println("*********Copy data*******************");
		Copy.dsipaly();
		

	}

}

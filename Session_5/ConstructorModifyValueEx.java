package Session_5;

public class ConstructorModifyValueEx {
	
	private String name;
	private int age;
	
	public ConstructorModifyValueEx(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public void setName(String name) {
		this.name = name;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	public void displayinfo() {
		System.out.println("Name:"+this.name);
		System.out.println("age:"+this.age);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorModifyValueEx cmve=new ConstructorModifyValueEx("gokul",24);
		System.out.println("Initial displayinfo ");
		cmve.displayinfo();
		cmve.setName("mohan");
		cmve.setAge(23);
		System.out.println("after Modification");
		cmve.displayinfo();
		
	

	}

}

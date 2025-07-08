package Session_6;

public class PersonRoleOverride extends Person {
	
	//implicit overriding
	public void inHouse() {
		System.out.println("to full fill the needs of their parents");
		
	}
	public void inOffice() {
		System.out.println("work as Developer");
	}
	public static void main(String[] args) {
		Person pro=new PersonRoleOverride();  //polymorphism (parentclass object=new childclass())
		pro.inHouse();
		pro.inOffice();
	}
}

package Session_6;

public class AccessEncapsulation {
	public static void main(String[] args) {
		Encapslation ee=new Encapslation();
		ee.setName("Gokul");
		ee.setLocation("Sathy");
		ee.setCollege("KGISL IIM COLLEGE");
		ee.setRollno(26);
		ee.setDept("MCA");
		
		System.out.println("name:"+ee.getName());
		System.out.println("Roll-no:"+ee.getRollno());
		System.out.println("Department:"+ee.getDept());
		System.out.println("college-name:"+ee.getCollege());
		System.out.println("location:"+ee.getLocation());
		
	}
}

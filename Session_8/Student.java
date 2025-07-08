package Session_8;

public class Student {
	
	//variable declaration
	String name;
	int age;
	//parameterized constructor
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	

}


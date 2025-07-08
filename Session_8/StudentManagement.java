package Session_8;

import java.util.ArrayList;

public class StudentManagement {

	public static void main(String[] args) {
		ArrayList<Student> students=new ArrayList<Student>();
		//add student data
		students.add(new Student("gokul", 12));
		students.add(new Student("mohan", 14));
		students.add(new Student("ramu", 13));
		students.add(new Student("Faizan", 14));
		
		
		//iterate the student data
		 for(Student names:students) {
				System.out.println(names);
			}


	}

}

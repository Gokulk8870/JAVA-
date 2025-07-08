package Session_4;



enum Program{HTML,CSS,BOOTSTRAP,JS,JAVA,PYTHON};  //declare on inside class and outside of class

public class EnumTEStEx {
	
	
	/**
	 *Keyword usde for enumeration-->enum
	 *
	 * Syntax:
	 * enum enum-name{constant1,constant2,....};
	 * 
	 * Rules:
	 * is an non primitive datatype
	 * -->Enum is a datatype which contains fixed set of constants.
	 * -->naming convension:all enum constants in capital letter.
	 * -->Java Enum,Constants are static and final implicitly
	 * -->Enum can be thought of as classes which have fixed set of constants.
	 * 
	 *
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(Program p:Program.values()) {
			System.out.println(p);
		}
		
		/**
		 * value()-->to access all the values stored in an enum-name.
		 * 
		 */

	}

}

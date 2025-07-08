package Session_5;

public class WrapperClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=Integer.valueOf(50);
		
		System.out.println("--AUTO BOXING--");
		Integer intval=50;
		Double doubleval=36.46789;
		Boolean bval=true;
		Character cval='M';
		
	
		System.out.println(intval);
		System.out.println(doubleval);
		System.out.println(bval);
		System.out.println(cval);
		
		System.out.println("--UNBOXING--");
		int d1=intval;
		double d2=doubleval;
		boolean d3=bval;
		char d4=cval;
		
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		
		System.out.println("-Utility method from wrapper class");
		
		int regno=Integer.parseInt("567");
		double Per=Double.parseDouble("93.75");
		boolean data=Boolean.parseBoolean("true");
		
		System.out.println(regno);
		System.out.println(Per);
		System.out.println(data);
		
		
		
		
		

	}

}

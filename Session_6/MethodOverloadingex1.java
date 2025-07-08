package Session_6;

public class MethodOverloadingex1 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println("the value of c:"+c);
	}
	
	public void add(float a, int b) {
		float d=a+b;
		System.out.println("the value of d:"+d);
	}
	
	public void add(double a,float b) {
		double d=a+b;
		System.out.println("the value of d:"+d);
	}
	
	public static void main(String[] args) {
		MethodOverloadingex1 moe1=new MethodOverloadingex1();
		moe1.add(20, 10);
		moe1.add(25.5f, 10);
		moe1.add(36.458, 45.89f);
	}
}

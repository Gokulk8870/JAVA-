package Session_4;

public class Constants {
	public static final double PI=3.14159;
	
	/**
	 * Constant create only use capitial letters
	 */

		public void display() {
			int radius=4;
			double area=Constants.PI*radius*radius;  //constant variable access on static to non static method use class name 
			System.out.println("REsult of area:"+area);
		}
	public static void main(String[] args) {
		Constants ct=new Constants();
		ct.display();
		

	}

}

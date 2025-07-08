package Session_4;

import java.util.Arrays;

public class Paratice1 {
	/**public final static float C=3.14f;
	void display() {
		System.out.println( "contants");
		float radius=12.67f;
		float d=(float) (C*radius);
		System.out.println("the valus:"+d);
		
		
		
	}*/
	public static void main(String[] args) {
//		 Paratice1 a=new  Paratice1();
//		 a.display();
		
		int[] arr=new int[8];
		
		Arrays.fill(arr, 1,6,6);
		System.out.println(Arrays.toString(arr));
		
		
		int b[]= {97,82,17,16,51,24,51,36,32,211,10,30};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
		
		int a=Arrays.binarySearch(b, 32);
		System.out.println(a);
		
		
		
	}

}

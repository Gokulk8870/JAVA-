package Session_3;

public class Array2DEx {

	public static void main(String[] args) {
		
		  // TODO Auto-generated method stub
		
//		String[][] code1=new String[3][2];
		String[][] code= {{"HTML ","CSS"},{"BOOTSTRAP ","jS"},{"JAVA ","Python"}};
		for(int i=0;i<code.length;i++) {
			for(int j=0;j<code[i].length;j++) {
				System.out.print(code[i][j]);
			}
			System.out.println();	
		}
		
		System.out.println("access using for each loop");
		
		for(String[] a:code) {   // convert 2d object to 1D
			
			for(String b:a) {    //convert 1d object to variable
				System.out.println(b); //finally print
			}
		}
}
}

package Session_7;

public class ExceptionEx6 {
	public static int divideNum(int a,int b) throws ArithmeticException,ArrayIndexOutOfBoundsException{
		int div=a/b;
		System.out.println(div);
		String name[]= {"Mugilan","Java","Info"};
		System.out.println(name[3]);
		return div;
		
	} 
	
	public static void main(String[] args) {
//		Exception ee6=new Exception();
		try {
			divideNum(36,0);
		}
		
		catch(ArithmeticException e){
			System.out.println("Number cannot didvide by 0");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array index is out of bound ");
			e.printStackTrace();
		}
	}
}

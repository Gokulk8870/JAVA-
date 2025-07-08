package Session_10;

public class AsyncNNumberPrinting {

	public static void main(String[] args) {
		Thread t1=new NumberPrinter(1,10);
		Thread t2=new NumberPrinter(90,100);
		t1.start();
		t2.start();

	}

}

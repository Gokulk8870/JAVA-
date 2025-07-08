package Session_10;

public class NumberPrinter extends Thread{
	private final int start;
	private final int end;
	public NumberPrinter(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		for(int i=start;i<=end;i++) {
			System.out.println(i);
		}
		try {
			Thread.sleep(500);
			
		}
		catch(InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}
	
}

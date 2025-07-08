package Session_9;

import java.io.FileReader;

public class FileReaderEX {
	public static void main(String[] args) {
		try (FileReader f = new FileReader(
				"C:\\\\Users\\\\Mohankumar.K\\\\eclipse-workspace\\\\Session_9\\\\src\\\\Session_9\\\\a.txt")) {
			char[] a=new char[100];
			f.read(a);
			for(char c:a) {
				System.out.println(c);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
		}
}

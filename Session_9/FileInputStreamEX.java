package Session_9;

import java.io.FileInputStream;

public class FileInputStreamEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		char c;

		try (FileInputStream f = new FileInputStream(
				"C:\\Users\\Mohankumar.K\\eclipse-workspace\\Session_9\\src\\Session_9\\a.txt")) {

			while ((i = f.read()) != -1) {
				c = (char) i; // down casting or implicit
				System.out.println(c);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex);
		}

	}

}

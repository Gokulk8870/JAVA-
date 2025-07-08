package Session_10;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteEx {
	public static void main(String[] args) {
		try(FileWriter f=new FileWriter("C:\\Users\\Mohankumar.K\\eclipse-workspace\\Session_10\\src\\Session_10\\c.txt")){
			String s="This is filewriter demo program content";
			char buf[]=new char[s.length()];
			s.getChars(0, s.length(), buf, 0);
			f.write(buf);
			
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}
}

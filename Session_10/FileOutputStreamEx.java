package Session_10;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx {
	public static void main(String[] args)throws IOException  {
			boolean bool;
			long pos;
			String s="Demo content for FileOutputStream Example";
			byte buf[]=s.getBytes();
			try(FileOutputStream fos=new FileOutputStream("C:\\Users\\Mohankumar.K\\eclipse-workspace\\Session_10\\src\\Session_10\\a.txt")){
				for(int i=0;i<buf.length;i++) {
					fos.write(buf[i]);
					System.out.println(i);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
	}

}

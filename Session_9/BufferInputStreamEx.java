package Session_9;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferInputStreamEx {
	public static void main(String[] args) {
		String s = "This Content is about BufferesInputStream demo Program";
		byte buf[] = s.getBytes();
		/**
		 * 
		 * --->String convert to byte --->then passed to bject of bytearrayinputstream
		 * class -->the bytearray data has been passed to bufferedInputstream -->finally
		 * in the while loop for each line the char by char the data been printed
		 * 
		 * 
		 * use cases :
		 * file uploading use 
		 */
		try (ByteArrayInputStream bt = new ByteArrayInputStream(buf);
				BufferedInputStream f = new BufferedInputStream(bt)) {
			int c;
			while ((c = f.read()) != -1) {
				System.out.println((char) c);

			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}

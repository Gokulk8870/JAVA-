package Session_9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
public static void main(String[] args) throws IOException {
	try(BufferedReader br=new BufferedReader(new InputStreamReader(System.in))){
		System.out.println("enter the 1st number:");
		String s1=br.readLine();
		System.out.println("enter the second number:");
		String s2=br.readLine();
		
		int i1=Integer.parseInt(s1);
		int i2=Integer.parseInt(s2);
		
		int res=i1+i2;
		
		System.out.println("sum:"+res);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
}
}

package Session_4;

import java.util.Arrays;

public class StringMethodsEx {

	public static void main(String[] args) {
		
		String s1="Java Developer";   //string literal
		String s2=new String("Java Developer"); //string object
		
		String s3=s2.intern();  //use intern() s3="Java Developer"
		/***
		 * 
		 * intern-->convert String object to string literal
		 * 
		 * 
		 */
		System.out.println(s1==s2);  //false
		System.out.println(s1==s3);  //true
		
		//2)Concat()
		
		String s4="Java ";
		String s5="Stack";
		String s6=s4.concat(s5);
		System.out.println(s6);
		
		//3.length()
		String name="Mugilan";
		int len=name.length();
		System.out.println(len);
		
		//4)Equals()
		//5)equalsIgnoreCase()
		String username="Gokul";
		String password="6380";
		
		if(username.equalsIgnoreCase("Gokul") && password.equals("6380")) {
			System.out.println("Login sucessfully");
		}else {
			System.out.println("invalid");
		}
		
		//6)tolowercase()
		
		String code ="JAVA";
		System.out.println(code.toLowerCase());
		
		//7)touppercase()
		
		String lower="gokul";
		System.out.println(lower.toUpperCase());
		
		
		//8)Charat()
		
		String str="program";
		char res=str.charAt(3);
		System.out.println(res);
		
		//9)getChars(int srcBegin,int srcEnd,char[] dist,int dstbegin)
		String str1=new String("Welcome to java");
		char[] ch1=new char[7];
		str1.getChars(11, 15, ch1, 0);
		System.out.println(ch1);
		
		//10)Chararray()
		String str2="Java Programming";
		char ch2[]=str2.toCharArray();
		System.out.println("*******************Demo*************************");
		System.out.println(Arrays.toString(ch2));
		System.out.println();
		for(char c1:ch2) {
			System.out.println(c1);
		}
		
		
		//11)Substring
		
		String str3="Hello World";
		
		System.out.println(str3.substring(6));
		System.out.println(str3.substring(0, 5));
		
		//12)Split()
		
		/**
		 * (StringTokenizer Update)
		 * 
		 * Jdk 1.4 -->introduced split method
		 */
		
		String code1="Object Oriented programming Language";
		String[] str4= code1.split("\\s");   
		for(String data1:str4) {
			System.out.println(data1);
		}
		
		
		
		//13)Join()
		String para=String.join("-","Java","Program");
		System.out.println(para);
		
		//14)TRim()
		
		String info1="					SpringBoot Application";
		System.out.println(info1.trim());
		
		
		//15)CompareTo
		
		/**
		 * 
		 * s1>s2-->Positive  ascii value
		 * s1<s2-->negative -ascii value
		 * s1==s2-->0
		 */
		
		String a="Hello";
		String b="Hello";
		int res1=a.compareTo(b);
		System.out.println(res1);
		
		
		
	    
		
		
		
		
		
	}

}

package Session_4;

import java.util.Arrays;

enum Names{GOKUL,MOHAN,RAMU,RAJU,GANESH,KRISH};

public class pratice {
	public static void main(String[] args) {
		/**
		 * String name="gokul k";
		
		System.out.println(name);
		
		String s=new String("gokul");
		System.out.println(s);
		
		char ch[]= {'g','o','k','u','l'};
		String info=new String(ch);
		System.out.println(info);
		
		
		//string object string literal convert
		String S1=s.intern();
		System.out.println(S1);
		
		
		String pass="gokul8870";
		
		if(name.equalsIgnoreCase("gokul k")&& pass.equals("gokul8870")) {
			System.out.println("login sucessfully");
		}
		else {
			System.out.println("Invalid");
		}
		
//		char x=name.charAt(3);
//		System.out.println(x);
		
		String str1=new String("Welcome to java");
		char[] ch1=new char[7];
		str1.getChars(11, 15, ch1, 0);
		System.out.println(ch1);
		
		String m=new String("welcome to great grigalan magic show");
		char n[]=new char[11];
		m.getChars(0, 10, n, 0);
		System.out.println(n);
		
		String g1="Java programming";
		char[] temp=g1.toCharArray();
		System.out.println(Arrays.toString(temp));
		 */
		
//		String para="               hi hello welcome to my youtube channel";
//		
//		String[] s3=para.split("//s");
//		for(String a:s3) {
//			System.out.println(a);
//		}
//		
//		String a="hello";
//		String b="hello";
//		int c=a.compareTo(b);
//		System.out.println(c);
//		
//		String h="                                    hi";
//		System.out.println(h.trim());
		
		
//		
//		int a[]= {12,3,4,5,6,78,34,5,2,1};
//		int b[]=Arrays.copyOf(a,a.length);
//		System.out.println(Arrays.toString(b));
//		
//		
//		int c[]= {3,4,5,6};
		//int d[]= {3,4,5,6};
//		System.out.println(Arrays.equals(c, d));
//		
//		int clone[]=c.clone();
		//System.out.println(Arrays.toString(clone));
		
		
		int a[]= {0,0,0};
		int b[]= {0,0,0};
		int c[]= {0,0,0};
		System.out.println(Arrays.toString(a)+"\n"+Arrays.toString(b)+"\n"+Arrays.toString(c));
		}
		
	}

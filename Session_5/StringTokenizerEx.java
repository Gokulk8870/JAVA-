package Session_5;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 *--> it allows to break a string into tokens
		 * -->it is legacy class in java
		 * -->it is deprecated now
		 */
		StringTokenizer st=new StringTokenizer("Java is a high level programming language"," ");
//		                                                                                  delimeter
		System.out.println("total no.of tokens:"+st.countTokens());
		while (st.hasMoreTokens()) //or hasmoretokens 
			
		{
			System.out.println(st.nextToken());
		}

	}

}

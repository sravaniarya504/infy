package com.infyshine;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
	   StringTokenizer st=
			   new StringTokenizer("Sravani sravs");
	           new StringTokenizer("Sravani sravs","a");
	           new StringTokenizer("Sravani sravs","a",true);
	   System.out.println("Number of Tokens:"+st.countTokens());
	   while(st.hasMoreTokens()) {
		   String token=st.nextToken();
		   System.out.println(token);
	   }
	}

}

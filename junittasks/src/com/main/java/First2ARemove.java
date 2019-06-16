package com.main.java;

public class First2ARemove {

	public String remove(String string) {
		/*
		 * Remove A from first 2 char
		 * 1.ABCD => BCD
		 * 2. AACD => CD
		 * 3. BACD => BCD
		 * 4. AABAA => BAA
		 */
		int i=0,c=0;
		while(i<2)
		{
		if (string.charAt(c)=='A')
		{
			
			string=string.substring(0, c)+string.substring(c+1);
			
		}else {c++;}
		
		i++;
		}
		return string;
	}

}

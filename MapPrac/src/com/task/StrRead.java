package com.task;

public class StrRead {

	public static void main(String[] args) {
		String str="aabccdeef";
		char[] s=str.toCharArray();
		int j=0;
		for(int i=0;i<s.length;i++)
		{
			j++;
			if(i==0 && s[i]!=s[i+1])
			{
				
			System.out.println(s[i]);
			}
			else if(i>0 && s[i-1]!=s[i])
			{
				if(s[i]!= (j==s.length?s[i-1]:s[i+1]))
				{
				
				System.out.println(s[i]);
				}
				
			}
			
			
			
		}
		
	}

}

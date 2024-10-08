package com.javaSpring;

import java.util.*;

public class B {
	
	
	public static boolean prime(int n)
	{
		if(n==0 || n==1)
		{
			return false;
		}
		for(int i=2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static boolean palindrome(int n)
	{
		int temp = n;
		int rev = 0;
		
		while(temp!=0)
		{
			int digit = temp % 10;
			 rev = rev*10+digit;
			 temp /= 10;
		}
		if(n==rev)
		{
			return true;
		}
		return false;
	}
	
	
	public static boolean palindromeString(String s)
	{
		String rev ="";
		
	for(int i=s.length()-1; i>=0; i--)
		
	{
		rev += s.charAt(i);
		
	}
	if(s.equals(rev))
	{
		return true;
	}
	return false;
	}

}

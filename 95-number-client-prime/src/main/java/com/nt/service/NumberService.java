package com.nt.service;

import org.springframework.stereotype.Service;

@Service
public class NumberService {
	
	public String isPrime(Integer num)
	{

		int count=0;
		if(num==1) {
			return num+" is a Prime number";
			
		}
	    for(int i=2;i<num/2;i++)
	    {
	    	if(num%i==0)
	    		count++;
	    }
		if(count==0)
			return num+" is a Prime number";
			return num+" is Not a prime Number";
		}
	
	public String isPalindrome(Integer num)
	{
		
		int temp = num;
		int sum=0;
		while(num!=0)
		{
			int rem = num%10;
			sum = sum * 10 + rem;
			num/=10;
		}
		if(sum==temp)
			return temp+" is a Palindrome Number";
		   return temp+" is Not a Palindrome Number";
	}

	
	public String isArmstrong(Integer num) {

	    int original = num;
	    int temp = num;
	    int digits = String.valueOf(num).length();
	    int sum = 0;

	    while (temp != 0) {
	        int digit = temp % 10;
	        sum += Math.pow(digit, digits);
	        temp /= 10;
	    }

	    if (sum == original) {
	        return num + " is an Armstrong Number";
	    } else {
	        return num + " is Not an Armstrong Number";
	    }
	}
}

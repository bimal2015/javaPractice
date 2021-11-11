package com.restapiconsume.restapiexample;

public class Prime {

	public static void main(String[] args) {
		int num = 4;
		boolean isPrime=true;
		for(int i=num-1;i>=1;i--) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(!isPrime) {
			System.out.println("Is a prime number");
		}else {
			System.out.println("IS NOT PRIME");
		}
		}
	
	}
		
	


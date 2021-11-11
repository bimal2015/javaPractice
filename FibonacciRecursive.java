package com.restapiconsume.restapiexample;

public class FibonacciRecursive {

	public static void main(String[] args) {
	int fib =5;
	int sum =fibibonanci(5);

	}
	private static int fibibonanci(int n) {
	
		return fibibonanci(n-1)+fibibonanci(n-2);
	}

}

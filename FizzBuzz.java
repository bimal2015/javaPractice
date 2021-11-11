package com.restapiconsume.restapiexample;

public class FizzBuzz {

	public static void main(String[] args) {
		Integer num=15;
		
		String result="";
			if(num%3==0) {
				result+="fizz";
			}
			if(num%5==0) {
				result+="buzz";
		}if(result.equals("")) {
			result=num.toString();
		}
		System.out.println(result);
	}

}

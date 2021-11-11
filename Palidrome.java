package com.restapiconsume.restapiexample;

public class Palidrome {

	public static void main(String[] args) {
		String palidrome ="abbbbac";
		boolean isPalidrome=true;
		int i=0;
		int j=palidrome.length()-1;
		while(j >1) {
			if(palidrome.charAt(i)!=palidrome.charAt(j)) {
				isPalidrome=false;
				break;
			}
			i++;
			j--;
		}
		if(isPalidrome) {
			System.out.println("Is Palidrome");
		}
	}

}

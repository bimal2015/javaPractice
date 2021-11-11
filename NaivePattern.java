package com.restapiconsume.restapiexample;

public class NaivePattern {

	public static void main(String[] args) {
		String txt = "THIS IS A TEST TEXT TEST";
		String pat = "TEST";
		search(txt,pat);

	}

	private static void search(String txt, String pat) {
		int n = txt.length();
		int M=pat.length();
		
		for(int i=0;i<n-M;i++) {
			int j;
			for(j=0;j<M;j++) {
				if(txt.charAt(i+j)!=pat.charAt(j)) {
					
					break;
			
				}
			}
			if(j==M) {
				System.out.println("patten found"+i);
			}
		}
			
		
		
		
	}	

}
	
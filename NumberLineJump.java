package com.restapiconsume.restapiexample;

public class NumberLineJump {

	public static void main(String[] args) {
		
	
       String k1=findDistance(0, 2, 5, 3);
		System.out.println(k1);

	
	}

	private static String findDistance(int i, int j, int k, int l) {
		int k1=i;
		int k2=k;
		for(int n=0;n<4;n++) {
			k1=k1+j;
			k2=k2+l;
		}
		
		if((k1-k2)==0) {
			return "YES";
		}else {
		 return "NO";
		}
	}


	
}

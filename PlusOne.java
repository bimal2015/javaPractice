package com.restapiconsume.restapiexample;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int a[] = {4,3,2,1,9,4,8,9,6,3,6};
		int n[] = plusOne(a);
		System.out.println(Arrays.toString(n));
	}

	private static int[] plusOne(int[] a) {
		int n = a.length;
		for(int i =n-1;n>0;n--) {
			if(a[i]<9) {
			a[i]++;
			System.out.println(a.length);
			return a;
			}
			a[i]=0;
		}
	int [] newNumber= new int[n+1];
	newNumber[0]=1;
	
		return newNumber;
	}
		

}

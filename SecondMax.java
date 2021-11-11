package com.restapiconsume.restapiexample;

public class SecondMax {

	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int[] arr = {5,7,2,9,12,3};
		for (int i = 0; i < arr.length; i++) {
		  if (arr[i] > max) {
		    secondMax = max;
		    max = arr[i];
		  }

		  if (arr[i] < max && arr[i] > secondMax) {
		    secondMax = arr[i];
		  }
		}
		System.out.println(secondMax);
	}

}

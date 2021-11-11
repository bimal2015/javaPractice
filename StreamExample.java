package com.restapiconsume.restapiexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		
		List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		//
		
			System.out.println(squaresList);
		}
	

}

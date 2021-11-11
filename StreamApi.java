package com.restapiconsume.restapiexample;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
/**
 * 
 * @author bimal
 * Date: 11/10/2021
 * 
 * Stream API
 * 
 *
 */
public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(IntStream.range(1,5).sum());
System.out.println();

Stream.of("Bird","dog","cat","rat","rabbit").sorted().findFirst().ifPresent(System.out::print);
	
String[] names = {"bimal","chris","bob","sam","ankit","naresh","peter"};
	Arrays.stream(names).filter(x->x.equals("bimal")).sorted().count();
	
	String ste = "This is a testing stream api";
	int count =(int) ste.chars().filter(ch->ch=='T'||ch=='t').count();
	System.out.println("Number of occurence"+count);
	
	
	
	List<String> animals = Arrays.asList("Rat","bird","tiger","bunny","Kangaroo","goat");
	animals.stream().map(String::toLowerCase).filter(c->c.startsWith("b")).forEach(System.out:: print);
	
	System.out.println("\n");
	List<String> band = Arrays.asList("tool","metalica","motorhead","gun n roses","AC/Dc","led zepplins","mudvayne");
	band.stream().filter(c->c.startsWith("m")).collect(Collectors.toList()).forEach(x->System.out.println(x));
	
	Double d = Stream.of(1.1,2.1,3.1,4.1,5.1).reduce(0.0, (Double a,Double b)->a+b);
	System.out.println("total"+d);
	
	}
	
}

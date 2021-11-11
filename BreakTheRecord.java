package com.restapiconsume.restapiexample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BreakTheRecord {

	public static void main(String[] args) {
		Integer a[]= {3 ,4 ,21 ,36 ,10 ,28 ,35 ,5 ,24 ,42,3};
		Integer h=a[0];
		Integer l=a[0];
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer> sH = new HashSet<Integer>();
		Set<Integer> sL = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			if(a[i]>h) {
				h=a[i];
				sH.add(h);
			}if(a[i]<l) {
				l=a[i];
				sL.add(l);
			}
		}
		list.add(sH.size());
		list.add(sL.size());
		
		System.out.println(list.get(0));
		System.out.println(Math.round(57));
}
}
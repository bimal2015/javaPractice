package com.restapiconsume.restapiexample;

import java.util.ArrayList;
import java.util.List;

public class GradingStudent {

	public static void main(String[] args) {
		List<Integer> grades = new ArrayList<Integer>();
		grades.add(2);
		grades.add(73);
		grades.add(67);
		grades.add(37);
		grades.add(38);
	
		List<Integer> roundList = new ArrayList<Integer>();
		for (int i = 0; i < grades.size(); i++) {
			if(i>=1) {
				  
				Integer grade = grades.get(i);
				Integer multipleOffive = ((grade / 5) * 5)+5;
				if(multipleOffive >=40) {
					Integer difference = multipleOffive - grade;
					if(difference < 3) {
						roundList.add(multipleOffive);
					}	else {
							roundList.add(grade);
						}
					}
					
				

}
}
		for(Integer i:roundList) {
			System.out.println(i);
		}
		
	}
}
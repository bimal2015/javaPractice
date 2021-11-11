package com.restapiconsume.restapiexample;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCake {

	public static void main(String[] args) {
		List<Integer> candles=new ArrayList<Integer>();
		
		 
		candles.add(56);
		candles.add(560);

		candles.add(6);

		candles.add(78);

		candles.add(23);

		candles.add(56);
		

		Integer numArray[] = new Integer[candles.size()];
        int counter=0;
        int k=0;
        Integer num=numArray[0];
        for(Integer n:candles){
            
            numArray[k]=n;
            k++;
        }
        for(int i=0;i<numArray.length;i++) {
            
            if(numArray[i]>=num) {
                
                num=numArray[i];
                
                break;
            }
   
        for(int j=0;j<numArray.length;j++) {
            if(numArray[j]==num)
                counter++;
        }
        System.out.println(counter);
    }
    


    

}

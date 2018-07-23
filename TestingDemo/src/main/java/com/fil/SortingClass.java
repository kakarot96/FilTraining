package com.fil;

import java.util.Arrays;

public class SortingClass {

	
	public String sortString(String str){
		char[] array=str.toCharArray();
		
		for(int i=0;i<array.length-1;i++){
			for(int j=i+1;j<array.length;j++){
				
				if(array[i]>array[j]){
					char temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				
				}
				
			}
		}
		
		return String.valueOf(array);
	}
	
	
	
}

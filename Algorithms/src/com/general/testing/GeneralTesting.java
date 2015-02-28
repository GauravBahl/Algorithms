package com.general.testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GeneralTesting {
	
	
	public static void main(String[] args) {
		
		int[] a = {1,1,2,1,2,3,4,5,5,3,3,3,4,6};
		Arrays.sort(a);
		int previous = a[0];
		List<Integer> out = new ArrayList<Integer>();
		out.add(previous);
		for(int i=1;i<a.length;i++){
			if(a[i]!=previous){
				out.add(a[i]);
				previous = a[i];
			}
		}
		
		System.out.println(out);
	}
	

}

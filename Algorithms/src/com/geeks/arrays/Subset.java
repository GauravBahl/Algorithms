package com.geeks.arrays;

import java.util.Arrays;

public class Subset {

	static int[] a = {11,2,3,5,1};
	static int[] b = {2,11};
	public static void main(String[] args) {
		System.out.println(subSet(a,b));
	}
	private static boolean subSet(int[] a2, int[] b2) {
		boolean result = true;
		
		Arrays.sort(a2);
		
		for(int i=0;i<b2.length;i++){
			if(Arrays.binarySearch(a2, b2[i])<0){
				result = false;
				return result;
			}
		}
		
		return result;
	}
	
}

package com.geeks.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Duplicacy {
	
	private static int[] arr = {1, 2, 3, 1, 4, 5};
	private static int k = 3;
	// {1=4, 2=6, 3=8, 4=10}
	public static void main(String[] args) {
		distanceNum(arr);
	}

	
	private static void distanceNum(int[] arr2){
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr2.length;i++){
			int tmp = arr2[i];
			if(map.containsKey(tmp)){
				int tmp2 = map.get(tmp);
				map.put(tmp, tmp2+i);
			}else{
				map.put(tmp, i);
			}
		}
		
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		for(Integer a : set){
			int value = map.get(a);
			if(value<=k && value>1){
				System.out.println(a);
			}
		}
		
	}
	
	private static void countOccurence(int[] arr2) {
		HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr2.length;i++){
			int tmp = arr2[i];
			if(map.containsKey(tmp)){
				int tmp2 = map.get(tmp);
				map.put(tmp, ++tmp2);
			}else{
				int c = 1;
				map.put(tmp,c);
			}
		}
		
	}
		
	}
		


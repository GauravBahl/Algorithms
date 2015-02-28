package com.test.algorithms;

import java.util.HashSet;
import java.util.Set;

public class AnagramStringTest {
	
	
	public static String checkAnagram = "cdaacccc";
	
	public static void main(String[] args) {
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < checkAnagram.length(); i++) {
			if(!set.contains(checkAnagram.charAt(i))){
				set.add(checkAnagram.charAt(i));
			}else{
				set.remove(checkAnagram.charAt(i));
			}
		}
		
		if(set.isEmpty() || set.size()==1){
			System.out.println("Exists");
		}else{
			System.out.println("Not Exists");
		}
	}
	
	

}

package com.geeks.arrays;

import java.util.ArrayList;
import java.util.List;

public class LetsCheck {

	
	public static void main(String... args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		Object[] array =  list.toArray();
		System.out.println(array);
		
		test(1,2);
	}

	private static void test(Integer... j) {
		// TODO Auto-generated method stub
		
	}
}

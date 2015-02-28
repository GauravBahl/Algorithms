package com.youtube.saurabhschool;

public class LengthIncreasingCommonSubSequence {
	
	
	public static int lengthIncreasingSubSequence(int[] p_input){
		
		int slice = p_input[0];
		int maxSoFar = p_input[0];
		
		for (int i = 1; i < p_input.length; i++) {
			maxSoFar+=p_input[i];
			maxSoFar = Math.max(maxSoFar, p_input[i]);
			slice = Math.max(slice, maxSoFar);
		}
		
		return slice;
	} 
		
	public static void main(String[] args) {
		int[] input =  {-2,-3,4,-1-2,1,5,-3};
		System.out.println(lengthIncreasingSubSequence(input));
	}

}

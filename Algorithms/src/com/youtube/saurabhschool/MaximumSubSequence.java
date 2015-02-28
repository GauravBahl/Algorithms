package com.youtube.saurabhschool;

public class MaximumSubSequence {

	/*
	 * Given an array, find out subarray suct that sum of its elements is maximum. 
	 * sometimes also known as maximum slice problem.
	 * */
	
	/*
	 * You can take an integer array and find out the array with maximum sum. 
	 * */
	
	
	public static int maxSubSequence(int[] p_array){

		 int maxSum = p_array[0];
		 int tempSum = p_array[0];
		 int max_start = 0;
		 int max_End = 0;
		 int T = 0;
		 
	//09466153500 - meenakshi
				 
		 for(int i=1;i<	p_array.length;i++){
			 
			 if(tempSum>0){
				 tempSum+=p_array[i];
			 }else{
				 tempSum = p_array[i];
				 T = i;
			 }
			 
			if(tempSum>=maxSum){
				max_start = T;
				max_End = i;
				maxSum = tempSum;
			}
			 
		 }
		
		 System.out.println("Start : " + max_start);
		 System.out.println("End : " +max_End);
		
		return maxSum;
	}
	
	public static void main(String[] args) {
		//int[] input = {-1,1,2,-3,3,-1,2,-2};
		int[] input =  {-2,-3,4,-1-2,1,5,-3}; 
		int output = maxSubSequence(input);
		System.out.println(output);
	}
	
}

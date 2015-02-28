package com.geeks.arrays;

public class Equilibrium {
	
	private static int[] a = {-7,1,5,2,-4,3,0};
	
	public static void main(String[] args) {
		getEqulibriumIndex(a);
	}
	
	private static void getEqulibriumIndex(int[] a) {
		int leftSum = a[0];
		int righSum = 0;
		int totalSum = 0;
		
		for(int i=0;i<a.length;i++){
			totalSum+=a[i];
		}
		
		for(int i=1;i<a.length;i++){
			righSum = totalSum - leftSum - a[i];
			
			if(righSum==leftSum){
				System.out.println(i);
				break;
			}
			
			leftSum+=a[i];
		}
		
	}

}

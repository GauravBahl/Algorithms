package com.geeks.arrays;

public class Sapera {
	
	public static void main(String[] args) {
		int a1 = 17;
		int d1 = 3;
		int count = 1;
		int[] A = new int[417];
		int[] B = new int[466];
		
		int index = 0;
		
		for (int i = a1; i < 417; i++) {
			System.out.print(i+" ");
			count++;
			A[index] = i;
			index++;
			i = i+d1;
		}
		
		
		index = 0;
		a1=16;
		d1=4;
		
		for (int j = a1; j < 466; j++) {
			System.out.print(j+" ");
			count++;
			B[index] = j;
			index++;
			j = j+d1;
		}
		
		
		
		//Now to calculate the intersection points
		intersection(A,B);
		
	}
	

	private static void intersection(int[] a, int[] b) {
		
		int sizeOfArrayOne = a.length;
		int sizeOfArrayTwo = b.length;
		int k=0,g=0;
		
		while(k<sizeOfArrayOne && g<sizeOfArrayTwo){
			
			if(a[k]<b[g]){
				k++;
			}else if(b[g]<a[k]){
				g++;
			}else{
				System.out.println(b[g++]);
				k++;
			}
		}
		
	}
	
	private static void union(int[] a , int[] b){
		
	}	
	
	
}

package com.geeks.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainProblem {
	
	public static void main(String[] args) throws IOException {
		String problem = null;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(reader.readLine());
		while(testCase-->0){
			problem = reader.readLine();
			System.out.println(solution(problem));
		}
	}

	
	private static int solution(String test) {
		
		int result = 0;
		StringBuilder chain = new StringBuilder(test);
		
		for(int i=0;i<chain.length()-1;i++){
			if(chain.charAt(i)=='_'){
				if(chain.charAt(i+1)!='+'){
					chain.setCharAt(i+1, '+');
					result++;
				}
			}
			
			if(chain.charAt(i)=='+'){
				if(chain.charAt(i+1)!='-'){
					chain.setCharAt(i+1, '-');
					result++;
				}
			}
			
		}
		
		return result;
	}

}

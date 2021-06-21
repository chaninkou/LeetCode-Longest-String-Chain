package leetcode1048;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		String[] input = {"a","b","ba","bca","bda","bdca"};
		
		System.out.println("Input: " + Arrays.toString(input));
		
		LongestChainSolution solution = new LongestChainSolution();
		
		System.out.println("Solution: " + solution.longestStrChain(input));
		
	}
}

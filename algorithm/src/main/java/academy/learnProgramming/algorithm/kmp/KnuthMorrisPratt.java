package academy.learnProgramming.algorithm.kmp;

import java.util.Arrays;

public class KnuthMorrisPratt {

	/**
	 * This method returns the index for the first match of pattern into the index
	 * it will return -1 if no match
	 * 
	 * i
	 * 0 1 2 3 4 5 6 7 8 9 10111213
	 * a b a z a c a b a b a b a c
	 * 
	 * a b a b a c
	 * 0 0 1 2 3 0
	 * j
	 * 
	 * 
	 * this example returns index of 8
	 * @param array
	 * @param pattern
	 * @return
	 */
	public int search(char[] array, char[] pattern) {
		int[] lsp =computeLongestSPTable(pattern);
		int j=0;
		for(int i=0;i<array.length;i++) {
			while(j>0 && array[i] != pattern[j]) {
				j=lsp[j-1];
			}
			if(pattern[j]== array[i]) {
				j++;
				if(j == pattern.length) {
					return i-j+1;
				}
			}
			
		}
		
		
		return -1;
	}
	
/**
 * This table computes the table of longest suffix and preffix of pattern.
 * this is to be used by knut morris Pratt Algorithm
 * 
 * @param pattern
 * @return
 */
	public int[] computeLongestSPTable(char[] pattern) {
		int [] lsp = new int[pattern.length];
		int j=0;
		for(int i=1;i<pattern.length;i++) {
			while(j>0 && pattern[i] != pattern[j]) {
				j=lsp[j-1];
			}
			
			if(pattern[i]==pattern[j]) {
				lsp[i]=++j;
			}
			else
				lsp[i]=0;
		}
//		for(int i=0;i<pattern.length;i++)
//			System.out.println(lsp[i]);
		return lsp;
	}
}

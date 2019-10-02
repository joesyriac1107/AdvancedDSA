package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.Arrays;

import academy.learnProgramming.algorithm.kmp.KnuthMorrisPratt;

public class TestMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ArrayList<String> A = new ArrayList<String>();
//		A.add("FEDCBECD");
//		A.add("FABBGACG");
//		A.add("CDEDGAEC");
//		A.add("BFFEGGBA");
//		A.add("FCEEAFDA");
//		A.add("AGFADEAC");
//		A.add("ADGDCBAA");
//		A.add("EAABDDFF");
//				
//		String B = "BCDCB";
		
//		WordSearch ws = new WordSearch();
//		
//		ws.exist(A, B);
//		
//		Knight kn = new Knight();
//		System.out.println(kn.knight(4, 7, 2, 6,2, 4));
		
		
//		Result rs = new Result();
//		System.out.println(rs.shortestSubstring("aabcce"));
//		6
//		KnuthMorrisPratt kmp = new KnuthMorrisPratt();
//		
//		System.out.println(kmp.computeLSPTable("babb".toCharArray()));
//		System.out.println(kmp.computeLSPTable("bbab".toCharArray()));
//	
//		MultiplicationString mps = new MultiplicationString();
//		System.out.println(mps.multiply("999", "999"));
		
		int[] arr = {-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3};
		Arrays.asList(-5, 1, 4, -7, 10, -7, 0, 7, 3, 0, -2, -5, -3, -6, 4, -7, -8, 0, 4, 9, 4, 1, -8, -6, -6, 0, -9, 5, 3, -9, -5, -9, 6, 3, 8, -10, 1, -2, 2, 1, -9, 2, -3, 9, 9, -10, 0, -9, -2, 7, 0, -4, -3, 1, 6, -3);


		ArrayList<Integer> abc = new ArrayList<Integer>(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3));
		
		ThreeSum ta = new ThreeSum();
//		System.out.println(ta.threeSumClosest(abc, -1));
		System.out.println(ta.removeDuplicates(abc));
	}

}

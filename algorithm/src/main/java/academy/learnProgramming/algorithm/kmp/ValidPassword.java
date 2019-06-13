package academy.learnProgramming.algorithm.kmp;

public class ValidPassword {
	
	/***
	 * 
	 * This method returns the validitiy of the password, by checking if any pattern is repeated three times
	 * 
	 * input: xccabababde
	 * return false
	 * 
	 * input: joesyriac
	 * return true
	 * 
	 * Algo used is to form LSP array for the given array n times,increasing the startingindex in each iteration
	 * Store the index of repeating sequence
	 * in LSP array lsp[index*2-1]==index && lsp[index*3-1]=index*2 
	 * then password invalid
	 * 
	 * Algorithm coplexity O(n^2)
	 * Space complexity O(n)
	 * 
	 * @param password
	 * @return
	 */

	public boolean validPassowrd(String password) {
		char[] passArray = password.toCharArray();

		for(int i =0;i<passArray.length;i++) {
			Pair pair=computeLSPTable(passArray, i);

			if(pair.index == 0) {
				continue;
			}else if(pair.index*2-1<pair.lsp.length && pair.index*3-1<pair.lsp.length){
				if(pair.lsp[pair.index*2-1]==pair.index 
						&& pair.lsp[pair.index*3-1]==pair.index*2) {
					return false;

				}
			}

		}

		return true;
	}

	/**
	 * 
	 * forming lsp array for different starting index
	 * 
	 * @param pattern
	 * @param startIndex
	 * @return Pair
	 * return lsp array and index where sequence repeats
	 */
	public static Pair computeLSPTable(char[] pattern,int startIndex) {
		int [] lsp = new int[pattern.length - startIndex];
		int j=0;
		int patternRepeatIndex=0;
		for(int i=startIndex+1;i<pattern.length;i++) {
			while(j>0 && pattern[i] != pattern[j+startIndex]) {
				j=lsp[j-1];
			}

			if(pattern[i]==pattern[j+startIndex]) {
				lsp[i-startIndex]=++j;
				if(j==1) {
					patternRepeatIndex=i-startIndex;
				}
			}
			else
				lsp[i-startIndex]=0;
		}
		//		for(int i=0;i<pattern.length-startIndex;i++)
		//			System.out.println(lsp[i]);

		return new Pair(lsp, patternRepeatIndex);
	}



	public static class Pair{
		public int[] lsp;
		public int index;
		public Pair(int[] lsp, int index) {
			super();
			this.lsp = lsp;
			this.index = index;
		}

	}

}

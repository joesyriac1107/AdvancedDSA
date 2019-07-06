package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.Stack;

public class WordSearch {

	public int exist(ArrayList<String> A, String B) {
		boolean isExist = false;
		for(int i=0;i<A.size();i++){
			for(int j=0;j<A.get(0).length();j++){
				if(B.charAt(0) == A.get(i).charAt(j)){
					isExist = checkForString(i,j,A,B,0); 
					if(isExist)
						return 1;
				}

			}
		}

		return 0;
	}

	public boolean checkForString(int i, int j,ArrayList<String>A,String B,int index){

		boolean result = false;
		Stack<Pair> pairStack = new Stack<Pair>();
		addToStack(pairStack,i,j,A.size(),A.get(0).length(),index);

		while(!pairStack.isEmpty()){
			Pair temp = pairStack.pop();
			if(A.get(temp.row).charAt(temp.column) == B.charAt(temp.index)){
				if(index == B.length()-1){
					result = true;
					break;
				}

				addToStack(pairStack,temp.row-1,temp.column,A.size(),A.get(0).length(),temp.index+1);
				addToStack(pairStack,temp.row+1,temp.column,A.size(),A.get(0).length(),temp.index+1);
				addToStack(pairStack,temp.row,temp.column-1,A.size(),A.get(0).length(),temp.index+1);
				addToStack(pairStack,temp.row,temp.column+1,A.size(),A.get(0).length(),temp.index+1);


			}

		}

		return result;

	}

	public void addToStack(Stack<Pair> pairStack ,int i, int j,int maxRow,int maxColumn,int index){
		if(i<0 ||i>=maxRow ||j<0 ||j>=maxColumn)
			return;

		pairStack.push(new Pair(i,j,index));
	}

	public class Pair{
		int row;
		int column;
		int index;

		public Pair(int row,int column,int index){
			this.row=row;
			this.column=column;
			this.index=index;
		}
	}
}

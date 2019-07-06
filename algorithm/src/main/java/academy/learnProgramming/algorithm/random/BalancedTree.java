package academy.learnProgramming.algorithm.random;

public class BalancedTree {
	public Wrapper depth(VerticalTree.TreeNode A){

		if(A.left == null && A.right == null)
			return new Wrapper(true, 1);
		else if(A.right == null) {
			Wrapper left = depth(A.left);
			return new Wrapper(left.depth == 1, left.depth+1);    	
		}

		else if(A.left == null) {
			Wrapper right = depth(A.right);
			return new Wrapper(right.depth == 1, right.depth+1);

		}

		else {
			Wrapper left = depth(A.left);
			Wrapper right = depth(A.right);
			int max = Math.max(left.depth+1,right.depth+1);
			boolean isBalanced = Math.abs(left.depth - right.depth) <2;
			return new Wrapper(isBalanced && left.balanced && right.balanced , max);
		}

	}

	public int minDepth(VerticalTree.TreeNode A){
		if(A.left == null && A.right == null)
			return 1;
		else if(A.right == null) {
			return minDepth(A.left);
		}

		else if(A.left == null) {
			return minDepth(A.right)+1;

		}

		else {
			return Math.min(minDepth(A.left), minDepth(A.right));
		}
	}

	public class Wrapper{
		int depth;
		boolean balanced;
		public Wrapper(boolean balanced,int depth) {
			this.depth=depth;
			this.balanced=balanced;
		}
	}

}

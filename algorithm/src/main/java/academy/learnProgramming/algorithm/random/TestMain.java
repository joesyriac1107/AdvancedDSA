package academy.learnProgramming.algorithm.random;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import academy.learnProgramming.algorithm.random.VerticalTree.TreeNode;

public class TestMain {
	public static int preIndex=0;
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
//	VerticalTree.TreeNode A = new VerticalTree.TreeNode(1);
//	A.left = new VerticalTree.TreeNode(2);
////	A.right = new VerticalTree.TreeNode(3);
////	A.left.left = new VerticalTree.TreeNode(4);
////	A.left.right = new VerticalTree.TreeNode(5);
		
		
		
				Character[] a = {'X','O','X','X','X','X','O','O','X','X'};
				Character[] b = {'X','O','O','O','O','X','O','O','X','X'};
				Character[] c = {'O','X','X','O','O','X','X','X','O','O'};
				Character[] d = {'O','X','O','X','O','O','O','X','X','O'};
				Character[] e = {'O','X','O','O','X','X','O','O','X','X'};
				Character[] f = {'O','X','X','X','O','X','X','O','X','O'};
				Character[] g = {'O','O','X','X','X','X','O','X','O','O'};
				
				
		
				List<Character> a1 = Arrays.asList(a);
				List<Character> b1 = Arrays.asList(b);
				List<Character> c1 = Arrays.asList(c);
				List<Character> d1 = Arrays.asList(d);
				List<Character> e1 = Arrays.asList(e);
				List<Character> f1 = Arrays.asList(f);
				List<Character> g1 = Arrays.asList(g);
				
				ArrayList<List<Character>> input = new ArrayList<List<Character>>();
				input.add(a1);
				input.add(b1);
				input.add(c1);
				input.add(d1);
				input.add(e1);
				input.add(f1);
				input.add(g1);
				Islands isl = new Islands();
				isl.solve(input);
//		ArrayList<Integer> preOrder = new ArrayList<>();

//		
//		TestMain main = new TestMain();
////		TreeNode A= main.makeBtree(preOrder, inOrder, 0, inOrder.size()-1);
////		
////		main.printINORDER(A);
//		
//		TreeNode A = main.makeBST(preOrder, 0, preOrder.size()-1);
//	
	}
	
	public TreeNode makeBtree(ArrayList<Integer> preOrder, ArrayList<Integer> inOrder, int start, int end){
        if(start>end)
            return null;
            
        TreeNode root = new TreeNode(preOrder.get(preIndex));
        preIndex++;
        if(start == end)
            return root;
            
        int index = getInOrderIndex(inOrder,  start,  end, root.val);
        root.left=makeBtree(preOrder,inOrder,start,index-1);
        root.right=makeBtree(preOrder,inOrder,index+1,end);
        
        return root;
        
            
            
    }
	
	   public TreeNode makeBST(List<Integer> a , int start ,int end){
	        if(start>end)
	            return null;
	       
	        int mid = (start+end)/2;
	       TreeNode root = new TreeNode(a.get(mid));
	      
	        if(start == end)
	            return root;
	        root.left=makeBST(a,start,mid-1);
	        root.right=makeBST(a,mid+1,end);
	        
	        HashSet<Integer> abs = new HashSet<Integer>();
	 
	        return root;
	    }
	
	public void printINORDER(TreeNode root){
		if(root!=null){
			printINORDER(root.left);
			System.out.print("  " + root.val);
			printINORDER(root.right);
		}
	}
    
    public int getInOrderIndex(ArrayList<Integer> inOrder, int start, int end, int data){
        for(int i = start;i<=end;i++){
            if(inOrder.get(i).equals(data))
                return i;
        }
        
        return -1;
    }
    
    public class TreeNode{
    	int val;
	       TreeNode left;
	        TreeNode right;
	        TreeNode(int x) {
	         val = x;
	         left=null;
	         right=null;
	        }
    }

}

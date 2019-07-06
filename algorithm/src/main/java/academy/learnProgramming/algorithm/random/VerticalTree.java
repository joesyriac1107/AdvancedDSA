package academy.learnProgramming.algorithm.random;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;


public class VerticalTree {
	
	   public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode A) {
	         
		   ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		   
		   HashMap<Integer,ArrayList<Integer>> arrayMap = new HashMap<Integer, ArrayList<Integer>>();
	         
	         
	         ArrayList<Integer> leftRight = new ArrayList<Integer>();
	         leftRight.add(0);
	         leftRight.add(0);
	         
	        Queue<QueueNode> nodeQueue = new ArrayDeque<QueueNode>();
	        nodeQueue.add(new QueueNode(0, A));
	        
	        while(!nodeQueue.isEmpty()) {
	        	QueueNode currentNode = nodeQueue.remove();
	        	
	        	if(currentNode.node.left != null)
	        		nodeQueue.add(new QueueNode(currentNode.current-1, currentNode.node.left));
	        	
	        	if(currentNode.node.right != null)
	        		nodeQueue.add(new QueueNode(currentNode.current+1, currentNode.node.right));
	        	
	        	if(leftRight.get(0)>currentNode.current)
	                leftRight.set(0,currentNode.current);
	            if(leftRight.get(1)<currentNode.current)
	                leftRight.set(1,currentNode.current);
	            
	            if(arrayMap.get(currentNode.current) == null) {
	            	ArrayList<Integer> verticalArray = new ArrayList<Integer>();
	            	verticalArray.add(currentNode.node.val);
	            	arrayMap.put(currentNode.current, verticalArray);
	            } else {
	            	arrayMap.get(currentNode.current).add(currentNode.node.val);
	            }
	        }
	        
	        for(int i =leftRight.get(0);i<=leftRight.get(1);i++) {
	        	result.add(arrayMap.get(i));
	        }
	       
	        	        
	        return result;
	    }
	   
	   public static class TreeNode {
		        int val;
		       TreeNode left;
		        TreeNode right;
		        TreeNode(int x) {
		         val = x;
		         left=null;
		         right=null;
		        }

	   }
	   
		 public static class QueueNode{
			public TreeNode node;
			public int current;
			 public QueueNode(int current, TreeNode node) {
				this.current=current;
				this.node= node;
			}
		 }

}

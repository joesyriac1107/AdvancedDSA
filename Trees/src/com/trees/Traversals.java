package com.trees;

import java.util.Stack;

public class Traversals {
	/*
	 *This method prints the in order traversal of a tree when a root note is given
	 *
	 *@param TreeNode rootNode 
	 */
	public void preOrderTraversal(TreeNode rootNode) {
		System.out.println("Pre Order Traversal: ");
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(rootNode);
		TreeNode currNode = null;
		while(stack.isEmpty() == false) {
			currNode=stack.pop();
			System.out.print(currNode.character);
			if(currNode.right != null)
				stack.push(currNode.right);
			if(currNode.left != null)
				stack.push(currNode.left);
		}

	}


	public void postOrderTraversal(TreeNode rootNode) {
		System.out.println("");
		System.out.println("Post Order Traversal: ");
		Stack<TreeNode> stack = new Stack<TreeNode>();
		Character lastPrinted=null;
		stack.push(rootNode);
		TreeNode currNode = null;
		while(!stack.isEmpty()) {
			currNode=stack.pop();
			if(currNode.left==null && currNode.right==null) {
				System.out.print(currNode.character);
				lastPrinted=currNode.character;
			}else if(currNode.right != null && currNode.right.character.equals(lastPrinted)){
				System.out.print(currNode.character);
				lastPrinted=currNode.character;
				
			}else if(currNode.left != null && currNode.left.character.equals(lastPrinted)) {
				
				System.out.print(currNode.character);
				lastPrinted=currNode.character;
			}else {
				
				stack.push(currNode);
				if(currNode.right!=null)
					stack.push(currNode.right);
				if(currNode.left != null)
					stack.push(currNode.left);
			}
		}
		

	}
	
	public void inOrderTraversal(TreeNode rootNode) {
		System.out.println("");
		System.out.println("In Order Traversal: ");
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(rootNode);
		TreeNode currNode = rootNode.left;
		while(!(stack.isEmpty() && currNode == null)) {
			if(currNode == null) {
				currNode=stack.pop();
				System.out.print(currNode.character);
				currNode=currNode.right;
				continue;
			}
			while(currNode != null) {
				stack.push(currNode);
				currNode=currNode.left;
			}
     
		}
		
	}
	

	public TreeNode setup() {
		TreeNode root=new TreeNode('A');
		TreeNode B=new TreeNode('B');
		TreeNode C=new TreeNode('C');
		TreeNode D=new TreeNode('D');
		TreeNode E=new TreeNode('E');
		TreeNode F=new TreeNode('F');
		TreeNode G=new TreeNode('G');
		TreeNode H=new TreeNode('H');
		TreeNode I=new TreeNode('I');
		TreeNode J=new TreeNode('J');
		TreeNode L=new TreeNode('L');
		TreeNode M=new TreeNode('M');

		root.left=B;
		root.right=C;
		B.right=E;
		B.left=D;
		D.right=H;
		H.left=I;
		E.right=J;
		C.left=F;
		C.right=G;
		G.right=L;
		L.left=M;

		return root; 	

	}
}

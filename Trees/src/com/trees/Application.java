package com.trees;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traversals traversal = new Traversals();
		
		traversal.preOrderTraversal(traversal.setup());
		traversal.postOrderTraversal(traversal.setup());
		traversal.inOrderTraversal(traversal.setup());
		

	}
	

}

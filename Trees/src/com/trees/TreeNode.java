package com.trees;

public class TreeNode {
	
	public Character character;
	
	public TreeNode left;
	public TreeNode right;
	public TreeNode(Character character) {
		this.character = character;
		this.left = null;
		this.right = null;
	}
	public TreeNode(Character character, TreeNode left, TreeNode right) {
		this.character = character;
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return character.toString();
	}
	
	
	
	

}

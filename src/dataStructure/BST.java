package dataStructure;

public class BST {
	
	TreeNode root;
	
	public BST() {
		this.root = null;
	}
	
	public void insert(int val) {
		TreeNode node = root;
		while (node != null) {
			if (val > node.val) { node = node.right; }
			else { node = node.left; }
		}
		node = new TreeNode(val);	 
	}
	


}

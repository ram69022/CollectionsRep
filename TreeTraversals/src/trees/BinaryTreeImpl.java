package binaryTrees;

public class BinaryTreeImpl {

	
	public Node root = null;
	
	public void insert(int data){
		root = insertRec(data,root);
	}
	
	public Node insertRec(int data, Node node){
		if(node==null){
			node = new Node(data);
		}else{
			if(data < node.data){
				node.left = insertRec(data,node.left);
			}else if(data > node.data){
				node.right = insertRec(data,node.right);
			}
		}
		return node;
	}
	
	public Node getRoot(){
		return root;
	}
		
}

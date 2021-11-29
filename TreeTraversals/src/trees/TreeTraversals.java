package binaryTrees;

import java.util.TreeMap;
import java.util.Vector;
import java.util.Map.Entry;

public class TreeTraversals {

	
	public void displayInorder(Node node){
		if(node==null)
			return;
		displayInorder(node.left);
		System.out.print(node.data);
		displayInorder(node.right);
	}
	
	public void displayPreorder(Node node){
		if(node==null)
			return;
		System.out.print(node.data);
		displayPreorder(node.left);
		displayPreorder(node.right);
	}
	
	public void displayPostorder(Node node){
		if(node==null)
			return;
		displayPostorder(node.left);
		displayPostorder(node.right);
		System.out.print(node.data);
	}
	
	public void displayLevelOrder(Node node){
		if(node==null)
			return;
		int h = height(node);
		for(int i=1;i<=h;i++){
			System.out.println("level=="+i);
			printGivenLevel(node,i);
			System.out.println("");
		}
	}
	
	
	public void printGivenLevel(Node node,int level){
		if(node==null)
			return;
		if(level==1){
			System.out.print(node.data+" ");
		}else if(level>1){
			printGivenLevel(node.left,level-1);
			printGivenLevel(node.right,level-1);
		}
		
	}
	
	public int height(Node node){
		if(node==null)
			return 0;
		return 1+Math.max(height(node.left),height(node.right));
		
	}
	
	public void displayVerticalOrder(Node node){
		TreeMap<Integer,Vector<Integer>> map = new TreeMap<Integer,Vector<Integer>>();
		int h = 0;
		getVerticalOrder(node,h,map);
		for(Entry<Integer,Vector<Integer>> entry:map.entrySet() ){
			System.out.println(entry.getValue());
		}
	}
	
	public void getVerticalOrder(Node node,int h,TreeMap<Integer,Vector<Integer>> map){
		if(node==null)
			return;
		Vector<Integer> v = map.get(h);
		if(v==null){
			v = new Vector<Integer>();
			v.add(node.data);
		}else{
			v.add(node.data);
		}
		map.put(h,v);
		getVerticalOrder(node.left,h-1,map);
		getVerticalOrder(node.right,h+1,map);
	}

	
	public static void main(String []args){
		try{
			TreeTraversals traverse = new TreeTraversals();
			BinaryTreeImpl obj = new BinaryTreeImpl();
			int [] arr = {5,3,9,1,2,6,4,0};
			for(Integer ss:arr){
				obj.insert(ss);
			}
			
			System.out.println("InOrder Traversal>>>");
			traverse.displayInorder(obj.getRoot());
			System.out.println("\n PreOrder Traversal>>>");
			traverse.displayPreorder(obj.getRoot());
			System.out.println("\n PostOrder Traversal>>>");
			traverse.displayPostorder(obj.getRoot());
			System.out.println("\n LevelOrder Traversal>>>");
			traverse.displayLevelOrder(obj.getRoot());
			System.out.println("\n VerticalOrder Traversal>>>");
			traverse.displayVerticalOrder(obj.getRoot());
			
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}

package Stacks;

public class LinkedListNode<T> {

	private T nodeValue;
	private LinkedListNode<T> nextNode;
	
	public LinkedListNode(T nodeValue){
		this.nodeValue = nodeValue;
	}
	
	public LinkedListNode<T> getNextNode(){
		return this.nextNode;
	}
	
	public void setNextNode(LinkedListNode<T> nextNode){
		this.nextNode = nextNode;
	}
	
	public void setNodeValue(T nodeValue){
		this.nodeValue = nodeValue;
	}
	
	public T getNodeValue(){
		return this.nodeValue;
	}
	
}

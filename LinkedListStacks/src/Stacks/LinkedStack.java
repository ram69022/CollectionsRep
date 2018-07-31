package Stacks;

public class LinkedStack<T> {

	private int size =0;
	private LinkedListNode<T> top;
	public LinkedStack(){}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return top == null;
	}
	
	public void push(T data){
		LinkedListNode<T> newNode = new LinkedListNode<T>(data);
		if(top==null){
			top = newNode;
		}else{
			newNode.setNextNode(top);
			top = newNode;
		}
		size++;
	}
	
	public T pop() throws NoSuchMethodException{
		if(top==null)
			throw new NoSuchMethodException("UnderFlow Exception");
		LinkedListNode<T> tNode = top;
		top = tNode.getNextNode();
		size--;
		return tNode.getNodeValue();
	}
	
	public T peek() throws NoSuchMethodException{
		if(top==null)
			throw new NoSuchMethodException("UnderFlow Exception");
		return top.getNodeValue();
	}

	public void display(){
		if(isEmpty()){
			System.out.println("Empty Stack!!");
			return;
		}
		LinkedListNode<T> node = top;
		while(node!=null){
			System.out.print(node.getNodeValue()+" ");
			node = node.getNextNode();
		}
		
	}
}

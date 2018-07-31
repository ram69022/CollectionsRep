package Stacks;

public class TestClass {

	public static void main(String [] args){
		try{
			LinkedStack<Integer> lstack = new LinkedStack<Integer>();
			lstack.push(1);
			lstack.push(2);
			lstack.push(3);
			lstack.push(4);
			lstack.push(5);
			lstack.push(7);

			lstack.display();
			System.out.println();
			System.out.println("Size=="+lstack.size());
			System.out.println("peeked element=="+lstack.peek());
			System.out.println("Popped element=="+lstack.pop());
			lstack.display();
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
}

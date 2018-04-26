/**
 *this class implements the state and behaviour of a simple stack 
 *of integers. it inherits from the class DDLinkedList in order to define 
 *a public interface to expose the general Stack operations and
 *to implement them
 */

public class Stack extends DDLinkedList{

	/**
	 *push an element to the top of the stack.
	 *@param val the integer value that the pushed element will hold.
	 */
	public void push(int val){
		this.addToHead(val);
	}
	/**
	*pop an element from the top of the Stack.
	*@return the value of the element popped from the top of the list.
	*/
	public int pop(){
		if(this.isEmpty()){ //stack is empty
			System.out.println("can't pop from an empty Stack");
			return -1;
		}
		return removeFromHead();
	}
	
}
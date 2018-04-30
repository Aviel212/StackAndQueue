/**
 *this class implements the state and behaviour of a simple stack 
 *of T's. it inherits from the class DDLinkedList in order to define 
 *a public interface to expose the general Stack operations and
 *to implement them
 */

public class Stack<T> extends DDLinkedList<T>{

	/**
	 *push an element to the top of the stack.
	 *@param val the T value that the pushed element will hold.
	 */
	public void push(T val){
		this.addToHead(val);
	}
	/**
	*pop an element from the top of the Stack.
	*@return the value of the element popped from the top of the list.
	*/
	public T pop(){
		return removeFromHead();
	}
	
}
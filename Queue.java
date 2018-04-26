/**
 *this class implements the state and behaviour of a simple queue 
 *of integers. it inherits from the class DDLinkedList in order to define 
 *a public interface to expose the general Queue operations and
 *to implement them
 */

public class Queue extends DDLinkedList{

	/**
	*enqueue an element to the back of the queue.
	*@param val the integer value that the enqueued element will hold.
	*/
	public void enqueue(int val){
		this.addToHead(val);
	}
	/**
	*dequeue an element from the front of the queue.
	*@return the value of the element dequeue from the Front of the queue, 
	*if the queue is empty ,it outputs a message and returns '-1'.
	*/
	public int dequeue(){
		int deqVal=this.getHead().getVal();
		this.removeFromHead();
		return deqVal;
	}
}
/**
 *this class implements the state and behaviour of a simple queue 
 *of T's. it inherits from the class DDLinkedList in order to define 
 *a public interface to expose the general Queue operations and
 *to implement them
 */

public class Queue<T> extends DDLinkedList<T>{

	/**
	*enqueue an element to the back of the queue.
	*@param val the T value that the enqueued element will hold.
	*/
	public void enqueue(T val){
		this.addToTail(val);
	}
	/**
	*dequeue an element from the front of the queue.
	*@return the value of the element dequeue from the Front of the queue, 
	*/
	public T dequeue(){
		return this.removeFromHead();
	}
}
/**
 *this class implements the state and behaviour of a basic 
 *doubly linked list ifrastructure of integers
 */
public class DDLinkedList<T>{
	private ListElement<T> head,tail;
	
	public ListElement<T> getHead(){
		return this.head;	
	}
	public ListElement<T> getTail(){
		return this.tail;	
	}
	/**
	 *Displays all the elements in the list.
	 */

	/**
	 *Indicates whether or not this list is empty.
	 *@return true if the list is empty, false otherwise
	 */
	public boolean isEmpty(){
		if(head==null && tail==null){
			return true;
		}
		else {
			return false;
		}
	}
	/**
	 *Add an element holding the T val to the head of the doubly-
	 *linked-list.
	 *@param val the T value of the new head object in the list.
	 */
	protected void addToHead(T val){
		ListElement<T> temp=new ListElement<>(val,head);
		if (this.isEmpty()){ //list is empty
			tail=temp;
		}
		else { //there are objects in the list
		head.setPrev(temp);
		}
		head=temp;
	}
	/**
	 *Add an element holding the T val to the tail of the doubly-
	 *linked-list.
	 *@param val the T value of the new tail object in the list.
	 */
	protected void addToTail(T val){
		ListElement<T> temp=new ListElement<>(val);
		if(this.isEmpty()){ //list is empty
			head=temp;
		}
		else { //there are objects in the list
			tail.setNext(temp);
		}
		tail=temp;
	}
	/**
	 *remove the head object that's in the list and sets the new head obj,
	 *it delets the reference so the garbage collector will dispose it.
	 *@return the value of the removed tail object.
	 */
	protected T removeFromHead(){
		T removedVal=head.getVal();
		head=head.getNext();
		if(head==null){ //only head exists
			tail=head;
		}
		else { //there is more then just the head in the list
			head.setPrev(null);
		}
		return removedVal;
	}
	/**
	 *remove the tail object that's in the list and sets the new tail obj,
	 *it delets the reference so the garbage collector will dispose it.
	 *@return the value of the removed tail object.
	 */
	protected T removeFromTail(){
		T removedVal=tail.getVal();
		tail=tail.getPrev();
		if(tail==null){ // if tail was head
			head=tail;
		}
		else { //there are 2 objects and tail needs to be removed
			tail.setNext(null);
		}
		return removedVal;
	}
	/**
	 *Add to the list an already allocated element, before a given element.
	 *@param newElm is the allocated element to be added to the list.
	 *@param beforeElm is the existing element in the list to add newElm before it.
	 */
	protected void addElm(ListElement<T> newElm, ListElement<T> beforeElm){ //need to double check the method
		if(this.isEmpty()){
			System.out.println("addElm::List is Empty!");
			return;
		}
		if(beforeElm==head){
			newElm.setNext(head);
			head.setPrev(newElm);
			head=newElm;
			return;
		}
		else if(beforeElm==null){
			tail.setNext(newElm);
			newElm.setPrev(tail);
			tail=newElm;
			return;
		}
		newElm.setNext(beforeElm);
		newElm.setPrev(beforeElm.getPrev());
		beforeElm.getPrev().setNext(newElm);
		beforeElm.setPrev(newElm);
	}
	
	public String toString()
	{
		ListElement<T> temp=this.getHead();
		if(temp==null) return "The list is empty"; //double check
		String disp="";
		while(temp!=null){                         //needs to be enhanced for loop
			disp+=temp.getVal()+" ";
			temp=temp.getNext();
		}
		return disp;
	}
}
/**
 *this class implements the state and behaviour of a basic 
 *doubly linked list ifrastructure of integers
 */
public class DDLinkedList{
	private ListElement head,tail;
	
	public ListElement getHead(){
		return this.head;	
	}
	public ListElement getTail(){
		return this.tail;	
	}
	/**
	 *Displays all the elements in the list.
	 */
	public void display(){
		ListElement temp=head;
		if (this.isEmpty()){
		System.out.println("the list is empty");
		}
		else{ 
			while(temp!=null){
				System.out.print(temp.getVal()+" ");
				temp=temp.getNext();
			}
		}
		System.out.println("");
	}
	/**
	 *Indicatex whether or not this list is empty.
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
	 *Add an element holding the integer val to the head of the doubly-
	 *linked-list.
	 *@param val the integer value of the new head object in the list.
	 */
	protected void addToHead(int val){
		if (this.isEmpty()){ //list is empty
			ListElement temp=new ListElement(val);
			head=temp;
		}
		else { //there are objects in the list
		ListElement temp=new ListElement(val,head);
		head.setPrev(temp);
		head=temp;
		}
	}
	/**
	 *Add an element holding the integer val to the tail of the doubly-
	 *linked-list.
	 *@param val the integer value of the new tail object in the list.
	 */
	protected void addToTail(int val){
		if(this.isEmpty()){ //list is empty
			ListElement temp=new ListElement(val);
			head=temp;
		}
		else if(tail==null && head!=null){ //only head exists
			ListElement temp=new ListElement(val);
			tail=temp;
			head.setNext(tail);
			tail.setPrev(head);
		}
		else { //there are objects in the list
			ListElement temp=new ListElement(val);
			temp.setPrev(tail);
			tail.setNext(temp);
			tail=temp;
		}
	}
	/**
	 *remove the head object that's in the list and sets the new head obj,
	 *it delets the reference so the garbage collector will dispose it.
	 *@return the value of the removed tail object.
	 */
	protected int removeFromHead(){
		if(this.isEmpty()){ //list is empty
			System.out.println("can't remove what's not exist");
		}
		else if(head.getNext()==null){ //only head exists
			int removedVal=head.getVal();
			head=null;
			return removedVal;
		}
		else { //there is more then just the head in the list
			int removedVal=head.getVal();
			head.getNext().setPrev(null);
			head=head.getNext();
			return removedVal;
		}
		return -1; //should not get here
	}
	/**
	 *remove the tail object that's in the list and sets the new tail obj,
	 *it delets the reference so the garbage collector will dispose it.
	 *@return the value of the removed tail object.
	 */
	protected int removeFromTail(){
		if(this.isEmpty()){ //list is empty
			System.out.println("can't remove whats not exist");
		}
		else if(head!=null && tail==null){ //only head exists
			int removedVal=head.getVal();
			head=null;
			return removedVal;
		}
		else{ //there is more then just the head in the list
			int removedVal=tail.getVal();
			if(tail.getPrev()!=head){ // if there are more then two object 
				tail=tail.getPrev();
				tail.setNext(null);
			}
			else { //there are 2 objects and tail needs to be removed
				tail=null;
				head.setNext(null);
			}
			return removedVal;
		}
		return -1; //should not get here
	}
	/**
	 *Add to the list an already allocated element, before a given element.
	 *@param newElm is the allocated element to be added to the list.
	 *@param beforeElm is the existing element in the list to add newElm before it.
	 */
	protected void addElm(ListElement newElm, ListElement beforeElm){ //need to double check the method
		beforeElm.getPrev().setNext(newElm);
		newElm.setNext(beforeElm);
		newElm.setPrev(beforeElm.getPrev());
		beforeElm.setPrev(newElm);
	}
	
	
}
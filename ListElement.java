/**
 *This class implements the state and behaviour of a list element
 *@param next a reference to the next object in the list
 *@param prev a reference to the previous object in the list
 *@param val an integer data value
 */
class ListElement<T>{
	
	private ListElement<T> next,prev;
	private T val;

	/**
	 *the default ListElement constructor..
	 */
	public ListElement(){
		//by default: next=null, prev=null,
		//val=0
	}
	/**
	 *3 parameters ListElement constructor.
	 *@param val the T value for the new element.
	 *@param next the reference to the object located after the new object in the list.
	 *@param prev the reference to the object located before the new object in the list.
	 */
	public ListElement(T val, ListElement<T> next, ListElement<T> prev){
		this.val=val;
		this.next=next;
		this.prev=prev;
	}
	/**
	 *1 parameter ListElement constructor.
	 @param val the T value for the new element.
	 */
	public ListElement(T val){
		this(val,null,null); //the 3 parameter constructor
	}
	/**
	 *2 parameters ListElement constructor.
	 *@param val the T value for the new element.
	 *@param next the reference to the object stands after the new object in the list.
	 */
	public ListElement(T val, ListElement<T> next){
		this(val,next,null); //the 3 parameter constructor
	}
	/**
	 *get method for the internal data value.
	 *@return the value of "this" ListElement.
	 */
	public T getVal(){
		return this.val;
	}
	/**
	*get method for the next ListElement reference.
	*@return the next ListElement reference.
	*/
	public ListElement<T> getNext(){	
		return this.next;
	}
	/**
	*get method for the last ListElement reference.
	*@return the previous ListElement reference.
	*/
	public ListElement<T> getPrev(){
		return this.prev;
	}
	/**
	*set method for the next ListElement reference.
	*@param next the next ListElement reference.
	*/
	public void setNext(ListElement<T> next){
		this.next=next;
	}
	/**
	*set method for the previous ListElement reference.
	*@param the previous ListElement reference.
	*/
	public void setPrev(ListElement<T> prev){
		this.prev=prev;
	}
	/**
	*implementation of the toString method for this class.
	*@return the String representation of the internal integer value
	*held by "this" ListElement.
	*/
	@Override
	public String toString(){		
		return this.getVal().toString();   //check   double check
	}
	
}
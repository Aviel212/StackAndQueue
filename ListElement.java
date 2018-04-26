
/**
 *This class implements the state and behaviour of a list element
 *@param next a reference to the next object in the list
 *@param prev a reference to the previous object in the list
 *@param val an integer data value
 */
class ListElement{
	
	private ListElement next,prev;
	private int val;

	/**
	 *the default ListElement constructor..
	 */
	public ListElement(){
		//by default: next=null, prev=null, val=0
	}
	/**
	 *3 parameters ListElement constructor.
	 *@param val the integer value for the new element.
	 *@param next the reference to the object located after the new object in the list.
	 *@param prev the reference to the object located before the new object in the list.
	 */
	public ListElement(int val, ListElement next, ListElement prev){
		this.val=val;
		this.next=next;
		this.prev=prev;
	}
	/**
	 *1 parameter ListElement constructor.
	 @param val the integer value for the new element.
	 */
	public ListElement(int val){
		this(val,null,null); //the 3 parameter constructor
	}
	/**
	 *2 parameters ListElement constructor.
	 *@param val the integer value for the new element.
	 *@param next the reference to the object stands after the new object in the list.
	 */
	public ListElement(int val, ListElement next){
		this(val,next,null); //the 3 parameter constructor
	}
	/**
	 *get method for the internal data value.
	 *@return the value of "this" ListElement.
	 */
	public int getVal(){
		return this.val;
	}
	/**
	*get method for the next ListElement reference.
	*@return the next ListElement reference.
	*/
	public ListElement getNext(){	
		return this.next;
	}
	/**
	*get method for the last ListElement reference.
	*@return the previous ListElement reference.
	*/
	public ListElement getPrev(){
		return this.prev;
	}
	/**
	*set method for the next ListElement reference.
	*@param next the next ListElement reference.
	*/
	public void setNext(ListElement next){
		this.next=next;
	}
	/**
	*set method for the previous ListElement reference.
	*@param the previous ListElement reference.
	*/
	public void setPrev(ListElement prev){
		this.prev=prev;
	}
	/**
	*implementation of the toString method for this class.
	*@return the String representation of the internal integer value
	*held by "this" ListElement.
	*/
	@Override
	public String toString(){		
		return Integer.toString(this.getVal());
	}
	
}
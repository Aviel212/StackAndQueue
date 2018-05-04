/**
*An abstract class that holds the reference of either the Queue or the Stack
*/
public abstract class GeneralHandler implements IntQueueStackHandler{
	protected Queue<Integer> intQ;
	protected Stack<Integer> intSt;
	/**
	 *The default GeneralHandler empty constructor
	 */
	public GeneralHandler(){
		//empty constructor
	}
	/**
	 *GeneralHandler constructor, initializes a new GeneralHandler 
	 *with a reference to a Queue of Integers 
     *@param intQ the reference to the Queue of Integers.
	 */
	public GeneralHandler(Queue<Integer> intQ){
		this.intQ = intQ;
		//intSt = null by default
	}
	/**GeneralHandler overloaded constructor, initializes
	*a new GeneralHandler from a given one 
	*@param intSt the reference to the Stack of Integers.
	*/
	public GeneralHandler(Stack<Integer> intSt){
		this.intSt = intSt;
		//intQ = null by default
	}

	//by default processRequest() is here and not implemented
}
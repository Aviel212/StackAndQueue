public abstract class GeneralHandler implements IntQueueStackHandler{
	protected Queue<Integer> intQ;
	protected Stack<Integer> intSt;
	
	public GeneralHandler(){
		//empty constructor
	}
	
	public GeneralHandler(Queue<Integer> intQ){
		this.intQ = intQ;
		//intSt = null by default
	}
	public GeneralHandler(Stack<Integer> intSt){
		this.intSt = intSt;
		//intQ = null by default
	}

	//by default processRequest() is here and not implemented
}
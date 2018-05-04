import javax.swing.JOptionPane;

/**
*This class defines two overloaded constructors, in order to match the overloaded constructors
*in 'GeneralHandler' class. And responsible to delete one element from the Stack/Queue  
 */
public class DequeuePopHandler extends GeneralHandler{
	/**DequeuePopHandler constructor, initializes a new  DequeuePopHandler
	*@param intQ the reference to a Queue of Integers 
	*/
	public DequeuePopHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	/**DequeuePopHandler constructor, initializes a new  DequeuePopHandler
	*@param intSt the reference to a Stack of Integers 
	*/
	public DequeuePopHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
	/**This method implements the abstact method "processRequest",
	*inherited from GeneralHandler class. This method Dequeue/Pop an item from
	*the Queue/Stack respectively, and presents  message to the user,
	*if the examined Queue/Stack is empty, issues an appropriate message to the user
	*/
	public void processRequest(){
		JOptionPane dialog = new JOptionPane();
		String action=null,type=null;
		int val=0;
		if(intQ==null){
			action="pop";
			type="Stack";
			if(intSt.isEmpty()){
				dialog.showMessageDialog(null,"The "+type+" is Empty!!!!");
				return;
			}
			else val = intSt.pop();
		}
		else {
			action="dequeue";
			type="Queue";
			if(intQ.isEmpty()){
				dialog.showMessageDialog(null,"The "+type+" is Empty!!!!"); //check about writing the same twice
				return;
			}
			else val = intQ.dequeue();
		}
		dialog.showMessageDialog(null,"value "+action+" from "+ type +" is: "+ val); 
	}
}
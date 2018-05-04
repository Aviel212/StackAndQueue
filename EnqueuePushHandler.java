import javax.swing.JOptionPane;
/**
*This class defines two overloaded constructors, in order to match the overloaded constructors
*in 'GeneralHandler' class. And responsible to add one element from the Stack/Queue  
*/

public class EnqueuePushHandler extends GeneralHandler{
	/**EnqueuePushHandler constructor, initializes a new  EnqueuePushHandler
	*@param intQ the reference to a Queue of Integers 
	*/
	public EnqueuePushHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	
	/**EnqueuePushHandler constructor, initializes a new  EnqueuePushHandler
	*@param intSt the reference to a Stack of Integers 
	*/
	public EnqueuePushHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
	/**This method implements the abstract method "processRequest",
	*inherited from GeneralHandler class. This method acquires input from the user 
	*and validates the input and if valid puts it in the 
	*Queue/Stack respectively.
	*@throws Exception if input is not valid
	*/
	public void processRequest(){
		JOptionPane dialog = new JOptionPane();
		String action=null,type=null;
		if(intQ==null){
			action="push";
			type="Stack";
		}
		else {
			action="enqueue";
			type="Queue";
		}
		String dialogmsg = "Please enter a number to "+action+" to the "+type;	
		String input=dialog.showInputDialog(dialogmsg);
		int val=0;
		try {
			val = Integer.parseInt(input);
		}
		catch (NumberFormatException e) {
			dialog.showMessageDialog(null,input+" is not Numeric, "+action+" aborted!");
				return;
		}
		if(type=="Stack") //check if by-value
			intSt.push(val);
		else
			intQ.enqueue(val);
		dialog.showMessageDialog(null,action+" operation of "+val+" successfully completed!"); 
	}
}
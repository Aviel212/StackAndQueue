import javax.swing.JOptionPane;

public class DisplayHandler extends GeneralHandler{
	/**DisplayHandler constructor, initializes a new  DisplayHandler
	*@param intQ the reference to a Queue of Integers 
	*/
	public DisplayHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	/**DisplayHandler constructor, initializes a new  DisplayHandler
	*@param intSt the reference to a Stack of Integers 
	*/
	public DisplayHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
	/**This method implements the abstact method "processRequest",
	*inherited from GeneralHandler class. This method display the contents
	*of the Queue/Stack respectively, present message to the user
	*/
	public void processRequest(){
		JOptionPane dialog = new JOptionPane();
		String action=null,type=null;
		if(intQ==null){
			action="push";
			type="Stack";
			dialog.showMessageDialog(null,type+" contents is: "+intSt );
		}
		else {
			action="enqueue";
			type="Queue";
			dialog.showMessageDialog(null,type+" contents is: "+intQ );
		}
	}
}
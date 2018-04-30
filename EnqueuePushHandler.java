import javax.swing.JOptionPane;

public class EnqueuePushHandler extends GeneralHandler{
	
	public EnqueuePushHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	public EnqueuePushHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
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
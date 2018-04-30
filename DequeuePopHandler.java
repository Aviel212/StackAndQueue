import javax.swing.JOptionPane;

public class DequeuePopHandler extends GeneralHandler{
	public DequeuePopHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	public DequeuePopHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
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
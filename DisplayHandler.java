import javax.swing.JOptionPane;

public class DisplayHandler extends GeneralHandler{
	public DisplayHandler(Queue<Integer> intQ){
		super(intQ);	
	}
	public DisplayHandler(Stack<Integer> intSt){
		super(intSt);	
	}
	
	@Override
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
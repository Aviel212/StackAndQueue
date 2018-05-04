import javax.swing.JOptionPane;

public class ExitHandler extends GeneralHandler{
		
	
	@Override
	/**This method implements the abstact method "processRequest",
	*inherited from GeneralHandler class. This method presents 
	*message to the user and command exit to System
	*/
	public void processRequest(){
		JOptionPane dialog = new JOptionPane();
		dialog.showMessageDialog(null,"Thank you and Goodbye");
		System.exit(0);
	}
}
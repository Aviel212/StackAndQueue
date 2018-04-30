import javax.swing.JOptionPane;

public class ExitHandler extends GeneralHandler{
		
	
	@Override
	public void processRequest(){
		JOptionPane dialog = new JOptionPane();
		dialog.showMessageDialog(null,"Thank you and Goodbye");
		System.exit(0);
	}
}
import java.util.Scanner;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

/**
 *this class implements the state and behaviour of a manager that will
 *define a queue and a stack. this class also display and handle a
 *simple menu to perform operations on the queue and the stack.
 *this class holds the main method to start and load the application.
 */
public class Manager{

	static Stack<Integer> st = new Stack<>();
	static Queue<Integer> qu = new Queue<>();
	final String[] menuMsgs={"Enqueue", "Dequeue", "Display Queue",
	"Push", "Pop", "Display Stack", "Exit"};
	
	static private IntQueueStackHandler[] handlers=
		{	new EnqueuePushHandler(qu),
			new DequeuePopHandler(qu),
			new DisplayHandler(qu),
			new EnqueuePushHandler(st),
			new DequeuePopHandler(st),
			new DisplayHandler(st),
			new ExitHandler()
		};
	
	/**
	 *Displays and handles the user choices interactively
	 */
	private void displayMenu(){
		System.out.println("");
		for (int i=0;i<menuMsgs.length;i++){
			System.out.println((i+1)+". "+menuMsgs[i]);	
		}
		System.out.print("please enter your choice: ");
	}
	/**
	 *the static main method, defines and initializes a new manager object
	 */
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		Manager mngr = new Manager();
		int choice=1,num=0;
		while(choice!=7){
			mngr.displayMenu();
			boolean i=false;
			while(!i){
				try{
					choice=input.nextInt();
					i=true;
				}
				catch(InputMismatchException e){ //not an integer
					input.nextLine();
					System.out.print("Try an integer between 1-7 from the menu: ");
					i=false;
				}
				try{
					handlers[choice-1].processRequest();
				}
				catch (ArrayIndexOutOfBoundsException e){ //array out of bounds
					if(choice<1 || choice>7){
						i=true;
						JOptionPane dialog = new JOptionPane();
						dialog.showMessageDialog(null, choice + " is an invalid choice! Please try again");
					}
						
				}
			}
		}
	}
}
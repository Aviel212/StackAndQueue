import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *this class implements the state and behaviour of a manager that will
 *define a queue and a stack. this class also display and handle a
 *simple menu to perform operations on the queue and the stack.
 *this class holds the main method to start and load the application.
 */
public class Manager{

	static Stack st;
	static Queue qu;
	String[] menuMsgs={"Enqueue", "Dequeue", "Display Queue",
	"Push", "Pop", "Display Stack", "Exit"};
	
	/**
	 *Manager constructor, 
	 *it creats new stack and queue and invokes the displayMenu method
	 */
	public Manager(){
		st=new Stack();
		qu=new Queue();
	}
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
				catch(InputMismatchException e){
					input.nextLine();
					System.out.print("Try an integer between 1-7 from the menu: ");
					i=false;
				}
			}
			
			switch (choice)
			{
			case 1:
				System.out.print("please enter the integer's value to enqueue to the Queue: ");
				i=false;
				while(!i){
					try{
						num=input.nextInt(); 
						input.nextLine();
						System.out.println("Input added successfuly");
						i=true;
					}
					catch(InputMismatchException e){
						System.out.print("Input must be an integer, try again: ");
						i=false;
					}
				}
				qu.enqueue(num);
				break;
			case 2:
				if(qu.isEmpty()){
					System.out.println("Queue is empty, that's why you cant use this function yet");
					System.out.println("Try again: ");
				}
				else {
					int deqNum=qu.dequeue();
					while(deqNum==-1){
						System.out.println("An Error Has Occourd, try again\nif the error repeates reboot the program"); //should not get here
					}
					System.out.println("the integer's value dequeued from Queue is: "+ deqNum);
				}
				break;
			case 3:
				System.out.println("Queue is: ");
				qu.display();
				break;
			case 4:
				System.out.print("please enter the integer's value to push to the Stack: ");
				i=false;
				while(!i){
					try{
						num=input.nextInt(); 
						input.nextLine();
						System.out.println("Input added successfuly");
						i=true;
					}
					catch(InputMismatchException e){
						System.out.print("Input must be an integer, try again: ");
						i=false;
					}
				}
				qu.enqueue(num);
				st.push(num);
				break;
			case 5:
				if(st.isEmpty()){
					System.out.println("Stack is empty, that's why you cant use this function yet");
					System.out.println("Try again: ");
				}
				else{
					int popNum=st.pop();
					while(popNum==-1){
						System.out.println("An Error Has Occourd, try again\nif the error repeates reboot the program"); //should not get here
					}
					System.out.println("the integer's value popped from the Stack is: "+popNum);
				}
				break;
			case 6:
				System.out.println("the Stack is:");
				st.display();
				break;
			case 7:
				System.out.println("Thank you for using the application");
			default:
				System.out.println("Try numbers between 1-7");
				break;
			}
		}
	}
	
}
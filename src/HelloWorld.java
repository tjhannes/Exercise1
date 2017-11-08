import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello ASE2017 - How are you? :)");
	
		System.out.print("Please enter your name:");
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();  //name = readString("Name: ");
		HelloUser user1 = new HelloUser(name);
		
		user1.greetUser();

		System.out.println("Hello ASE2017 - How are you now? :)");

	}
	
	public static String readString(String text) {
	    JFrame frame = new JFrame();
	    String s = JOptionPane.showInputDialog(frame, text);
	    frame.dispose();

	    if (s == null)
	      System.exit(0);
	    return s;
	  }

}

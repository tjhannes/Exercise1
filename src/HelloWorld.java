import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class HelloWorld {
	
	static String name;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
<<<<<<< HEAD
		System.out.println("Hello ASE2017 - How are you? :)");
		name = readString("Name: ");
		HelloUser.greetUser(name);
=======
		System.out.println("Hello ASE2017 - How are you now? :)");
>>>>>>> refs/heads/master
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

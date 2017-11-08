
public class HelloUser {

	private String username;
	
	public HelloUser(String pUserName){
		username = pUserName;
	}
	
	public void greetUser(){
		System.out.println("Hello "+username+" - How are you? :)");
	}
}


public class HelloUser {
	
	private String userName;
	
	public HelloUser(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void  greetUser(){
		System.out.println("Hello " + userName + "!");
	}
}

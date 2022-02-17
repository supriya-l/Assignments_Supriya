import java.util.*;
class Login{
	String userId = "Ajay", password = "password";
	String result;
	int count = 0;
    public String loginUser(String user, String pass) {	
    		if(user.equals(userId) && pass.equals(password)) {
    			result = "Welcome";
    			System.out.print("Welcome "+ user);
    		} else if(userId!=user || password!=pass) {
    			result = "Wrong";
    			System.out.print("Wrong credentials");
    		}
    	return result;
    }
}
 class Assignment1Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String user, pass;
		System.out.print("Enter username: ");
		user = sc.nextLine();
		
		System.out.print("Enter password: ");
		pass = sc.nextLine();
		
		Login l = new Login();
		l.loginUser(user, pass);
	}

}

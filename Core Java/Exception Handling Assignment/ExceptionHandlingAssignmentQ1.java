import java.util.Scanner;

public class ExceptionHandlingAssignmentQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a, b, c = 0; 
		//note that for float, it will give infinity, not an exception
		try {
		System.out.println("Enter the 1st number: ");
		a = sc.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		b = sc.nextInt();
		
		c = b/a;
		System.out.println("b/a is: "+ c);
		    
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Exception Catched");
		}
	}

}
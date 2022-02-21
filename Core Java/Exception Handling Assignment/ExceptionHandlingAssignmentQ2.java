
import java.util.Scanner;

public class ExceptionHandlingAssignmentQ2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c=0;
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		a = sc.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		b = sc.nextInt();
		
		c = b/a;
		if(a==0) {
			throw new UnsupportedOperationException("Can't be 0");
		}
		System.out.println("b/a is: "+ c);
	} catch(UnsupportedOperationException ue) {
		System.out.println(ue.getMessage());
	}

	}
}
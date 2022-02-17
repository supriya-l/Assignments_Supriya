import java.util.Scanner;
class ArmstrongOrNot{
	public void check(int num) {
		int temp = num;
		int res = 0;
		int rem;
		while(temp>0) {
			rem = temp%10;
			res = (int) (res + Math.pow(rem, 3));
			temp = temp/10;
		}
		if(res == num) {
			System.out.print("Armstrong.");
		} else {
			System.out.print("Not an Armstrong.");	
		}
	}
}
 class Assignment1arm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is armstrong or not: ");
		int number  = sc.nextInt();
		ArmstrongOrNot a = new ArmstrongOrNot();
		a.check(number);
	}

}
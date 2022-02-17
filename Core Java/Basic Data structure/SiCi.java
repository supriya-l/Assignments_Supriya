import java.util.*;
class SiCi{
	public double simpleInterest(double principalAmount, int time, double interestRate) {
		double si = (principalAmount * interestRate * time)/100;
		System.out.println("Simple Interest is: "+ si);
		return si;
	}
	
	public double compoundInterest(double principalAmount, int time, double interestRate) {
		double ci = principalAmount * Math.pow((1 + interestRate), time) - principalAmount;
		System.out.println("Compound Interest is: "+ ci);
		return ci;
	}
}
 class Assignment1Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the principal amount: ");
		double p = s.nextDouble();
		System.out.print("Enter the time: ");
		int t = s.nextInt();
		System.out.print("Enter the rate of interest: ");
		double r = s.nextDouble();
		
		SiCi sc = new SiCi();
		sc.simpleInterest(p, t, r);
		sc.compoundInterest(p, t, r);
	}

}
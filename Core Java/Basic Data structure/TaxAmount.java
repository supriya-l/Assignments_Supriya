import java.util.*;
class TaxAmount{
	double tax;
	public double calculateTaxAmount(int ctc) {
	
		if(ctc>0 && ctc<=181000) {
			System.out.print("Tax to be paid is: "+ tax);
		} else if(ctc>=181001 && ctc<=300000) {
			tax = 0.1*ctc;
			System.out.print("Tax to be paid is: "+ tax);
		} else if(ctc>=300001 || ctc<=500000) {
			tax = 0.2*ctc;
			System.out.print("Tax to be paid is: "+ tax);
		} else if(ctc>=500001 || ctc<=1000000) {
			tax = 0.3*ctc;
			System.out.print("Tax to be paid is: "+ tax);
		}
		return tax;
	} 
}
 class Assignment1Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int ctc;
		System.out.print("Enter your ctc in full digits: ");
		ctc = sc.nextInt();
		TaxAmount ta = new TaxAmount();
		ta.calculateTaxAmount(ctc);
	}

}
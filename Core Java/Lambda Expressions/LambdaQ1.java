
interface Arithmetic{
	double operation(double a,double b);
}
public class LambdaQ1 {

	public static void main(String[] args) {
		double x=19;
		double y=3;
		Arithmetic addition=(a,b)->a+b;
		Arithmetic subtraction=(a,b)->a-b;
		Arithmetic multiplication=(a,b)->a*b;
		Arithmetic division=(a,b)->(a/b);
		System.out.println("Addition "+x+" and "+y+"      :"+addition.operation(x, y));
		System.out.println("Subtraction "+x+" and "+y+"   :"+subtraction.operation(x, y));
		System.out.println("Multiplication "+x+" and "+y+":"+multiplication.operation(x, y));
		System.out.println("Division "+x+" and "+y+"      :"+division.operation(x, y));

	}

}
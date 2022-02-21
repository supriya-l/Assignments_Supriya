
@interface Execute{
	int sequence();
}
public class Annotation3 {

	@Execute(sequence = 2)
	public void myMethod1() {
		System.out.println("Method 1 called");
	}
	@Execute(sequence = 1)
	public void myMethod2() {
		System.out.println("Method 2 called");
	}
	@Execute(sequence = 3)
	public void myMethod3() {
		System.out.println("Method 3 called");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" sequence is:");

	}

}
abstract class A{
	int abstract_var;
}

abstract class B extends A{
	public abstract void fun();
}

class AbstractClass extends B {
	@Override
 public void fun() {
System.out.println("This is an example of an Abstract Class");
	}
}




 class Assignment2Q4 {
	public static void main(String[] args) {
		B b = new AbstractClass();
		b.fun();

}
}
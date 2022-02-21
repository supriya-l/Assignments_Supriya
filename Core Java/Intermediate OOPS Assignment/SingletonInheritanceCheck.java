class SingletonInheritanceCheck{
private static SingletonInheritanceCheck single_instance = null;
	
	public static SingletonInheritanceCheck getInstance() {
		if (single_instance == null) {
			single_instance = new SingletonInheritanceCheck ();
		}
		
		return single_instance;
	}
}


 class Assignment2Q1 {
	public static void main(String[] args) {
		SingletonInheritanceCheck a = SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck b = SingletonInheritanceCheck.getInstance();
		SingletonInheritanceCheck c = SingletonInheritanceCheck.getInstance();
	
	System.out.println("Hashcode of a is "+ a.hashCode());
	System.out.println("Hashcode of b is "+ b.hashCode());
	System.out.println("Hashcode of c is "+ c.hashCode());
	
	if (a == b && b == c) {
		System.out.println("Three objects point to the same memory location i.e., to the same object");
	}

	else {
		System.out.println("Three objects do not point to the same memory location ");
	}
	}
}
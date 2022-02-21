public class StringBuilderQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s1 = new StringBuilder("StringBuilder ");
		StringBuilder s2 = new StringBuilder("is a peer class of String ");
		StringBuilder s3 = new StringBuilder("that provides much of ");
		StringBuilder s4 = new StringBuilder("the functionality of strings.");
		s1.append(s2);
		//System.out.println(s1);
		
		s3.append(s4);
		//System.out.println(s3);
		
		s1.append(s3);
		System.out.println(s1);

	}

}
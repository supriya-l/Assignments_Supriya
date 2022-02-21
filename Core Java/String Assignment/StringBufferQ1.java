public class StringBufferQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s1 = new StringBuffer("StringBuffer ");
		StringBuffer s2 = new StringBuffer("is a peer class of String ");
		StringBuffer s3 = new StringBuffer("that provides much of ");
		StringBuffer s4 = new StringBuffer("the functionality of strings.");
		s1.append(s2);
		//System.out.println(s1);
		
		s3.append(s4);
		//System.out.println(s3);
		
		s1.append(s3);
		System.out.println(s1);
	}

}
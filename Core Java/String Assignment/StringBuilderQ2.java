public class StringBuilderQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s = new StringBuilder("It is used to _ at the "
				+ "specified index position.");
		StringBuilder s2 = new StringBuilder("insert text");
		s.delete(14, 15);
		s.insert(14, s2);
		System.out.println(s);

	}

}
public class StringBufferQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer s = new StringBuffer("It is used to _ at the "
				+ "specified index position");
		StringBuffer s2 = new StringBuffer("insert text");
		s.delete(14, 15);
		s.insert(14, s2);
		System.out.println(s);
	}

}
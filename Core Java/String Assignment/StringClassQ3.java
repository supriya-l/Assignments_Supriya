public class StringClassQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "Java String pool refers to collection of "
				+ "Strings which are stored in heap memory.";
		
		System.out.println("The string is: "+ a);
		System.out.println("1. Lowercase: "+ a.toLowerCase());
		System.out.println("2. Uppercase: "+ a.toUpperCase());
		System.out.println("3. Replace 'a' with '$': "+ a.replace('a', '$'));
		System.out.println("4. Contains collection?: "+ a.contains("collection"));
		
		String b = "java string pool refers to collection of "
				+ "strings which are stored in heap memory.";
		
		System.out.println("5. Matching a and b: " + a.equals(b));
		System.out.println("6. Matching a and b ignoring cases: "+ a.equalsIgnoreCase(b));
	}

}
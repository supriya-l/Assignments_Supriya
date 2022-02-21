@interface Test{}

class Library{
	@Test
	public void Book() {
		System.out.println("@Test applied on Method here");
	}
}
public class AnnotationTest {

	public static void main(String[] args) {
		Library library=new Library();
		library.Book();
	}

}
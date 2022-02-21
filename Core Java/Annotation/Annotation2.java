
@interface Info{
	int authorId();
	String authorName();
	String supervisor();
	String date();
	String time();
	double version();
	String description();
}
@Info(authorId = 24, authorName = "John", supervisor = "Sam", date = "12 Feb", time = "11:00AM", version = 1.2, description = "Custom Annotations")

class AnnotationInfo{
	public void display() {
		System.out.print("Custom Annotation");
	}
}
public class Annotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationInfo ai = new AnnotationInfo();
		ai.display();

	}

}
import java.util.Comparator;
import java.util.TreeMap;
enum gender{male, female}

class Contact{
	public long phoneNo;
	public String name;
	public String email;
	gender g;
	public Contact(String name, String email, gender g) {
		this.name = name;
		this.email = email;
		this.g = g;
	}
}
class Compare implements Comparator<Contact>{
	public int compare(Contact c1, Contact c2) {
		return 0;
	}
}
	
public class CollectionFrameworkQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <Long, Contact> tm = new TreeMap<Long, Contact>();
		Contact c1 = new Contact("Jasmine", "jj@gmail.com", gender.female); 
		tm.put(5555555555l, c1);
		tm.put(4444444444l, new Contact("A", "A@gmail.com", gender.female));
		tm.put(3333333333l, new Contact("B", "B@gmail.com", gender.male));
		tm.put(2222222222l, new Contact("C", "C@gmail.com", gender.female));
		tm.put(1111111111l, new Contact("D", "D@gmail.com", gender.male));
		
		
		
		System.out.println("Keys:");
		System.out.println(tm.keySet());
		System.out.println("Values:");
		System.out.println(tm.values());
		System.out.println("Pair:");
		System.out.println(tm);
	}
}


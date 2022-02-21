
import java.util.*;
class Pair{
	String key;
	String value;
	Date date = new Date();
	public Pair(String k, String v) {
		this.key= k;
		this.value=v;
	}
	public Pair(String k, Date d) {
		this.key=k;
		this.date=d;
	}
	public String getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	public Date getDate() {
		return date;
	}

}
public class GenericsAssignmentQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pair p = new Pair("K", "V");
		System.out.println(p.getKey());
		System.out.println(p.getValue());
		Pair q = new Pair("Kq", new Date());
		System.out.println(q.getKey());
		System.out.println(q.getDate());		
	
	}

}
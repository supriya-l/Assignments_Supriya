
import java.util.*;
public class GenericsAssignmentQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		HashMap<Integer, Double> map = new HashMap<>();
		for(int i=1; i<=10; i++) {
			map.put(r.nextInt(), r.nextDouble());
		}

		System.out.println(map);
	}

}
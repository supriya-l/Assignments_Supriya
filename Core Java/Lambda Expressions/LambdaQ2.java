
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class LambdaQ2 {
	private int totalPrice;
	private String status;

	public LambdaQ2(int totalPrice, String status) {
		super();
		this.totalPrice = totalPrice;
		this.status = status;
	}

	public static ArrayList<LambdaQ2> listOfOrders(ArrayList<LambdaQ2> orders) {

		ArrayList<LambdaQ2> filtered_data = orders.stream()
				.filter(check -> check.totalPrice > 10000)
				.filter(g ->g.status.contains("ACCEPTED") || g.status.contains("COMPLETED"))
				.collect(Collectors.toCollection(ArrayList::new));  
		 return filtered_data;
	}
	public static void main(String[] args) {
		ArrayList<LambdaQ2> ordersArrayList= new ArrayList<LambdaQ2>(
				Arrays.asList(
						new LambdaQ2(11000,"COMPLETED"),
						new LambdaQ2(8000,"COMPLETED"),
						new LambdaQ2(7000,"ACCEPTED"),
						new LambdaQ2(12000,"ACCEPTED"),
						new LambdaQ2(16000,"ACCEPTED")
						     ));
		listOfOrders(ordersArrayList)
				.forEach(LambdaQ2 -> System.out.println(LambdaQ2.totalPrice + ": " + LambdaQ2.status));

	}
}
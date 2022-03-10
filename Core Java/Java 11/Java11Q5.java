import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
public class Java11Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		boolean m =true;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number: ");
			System.out.println("1. Insert new price.");
			System.out.println("2. View purchase total.");
			System.out.println("3. Exit.");
			num = sc.nextInt();
			switch(num) {
			case 1->{
				System.out.println("In 'insert new price' case.");
				int c = 1;
				String price;
				String more = "Y";
				do {
					System.out.println("Entering "+c+" time:");
					price = sc.next();
					System.out.println();
					
					try {
						Files.writeString((Path.of("D:\\price.txt")), price+"\n", StandardOpenOption.APPEND);
						System.out.println("Price inserted.\n");
						System.out.println("Want to enter more? Y/N");
						more = sc.next();
					} catch(Exception e) {
						e.printStackTrace();
					}
					c++;
					
				}while(more.equalsIgnoreCase("Y"));
			}
			case 2->{
				System.out.println("In 'view total purchase' case.");
				try {
					//String sum = null;
					String read = Files.readString(Path.of("D:\\price.txt"));
//					List<String> l = Arrays.asList(read.split("\n"));
//					//System.out.println(l.size());
//					String a[] = l.toArray(n->new String[n]);
//					System.out.println(Arrays.toString(a));
//				
//					for (int i = 0; i < a.length; i++) {
//						sum = sum + a[i];
//					}
					List<String> l = read.lines().collect(Collectors.toList());
					List<Integer> arr = l.stream().map(s -> Integer.parseInt(s))
							.collect(Collectors.toList());
					Integer total = 0;
					for (Integer i : arr) {
						total += i;
					}
					System.out.println("Total Price: " + total + "\n");
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			case 3->{
				System.out.println("Exiting.");
				System.exit(0);
		
			}
			default->{
				System.out.println("Enter the valid number.");
			}
			}
			System.out.println("Do you want to continue? Y/N");
			String c;
			c = sc.next();
			if(c.equals("Y")) {
				continue;
			}
			else
				System.exit(1);
			
		}while(m);
	
	}

}
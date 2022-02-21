
public class GenericsAssignmentQ3 {

	public static <T> void swap(T[]a, int n, int o) {
		T t = a[n];
		a[n] = a[o];
		a[o] = t;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a[] = {1,2,3,4,5,6,7};
		swap(a,6,1);
		for (Integer i : a) {
			System.out.println(i);
		}

	}

}
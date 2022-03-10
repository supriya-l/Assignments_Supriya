import java.util.*;
public class Java11Q3 {
	 public static void main(String[] args) {
	        String str="A quick brown fox jumps over lazy dog";
	        ArrayList<String> arr=new ArrayList<>();
	        arr.addAll(Arrays.asList(str.split(" ")));
	        System.out.println(arr);
	        String[] array= arr.toArray(new String[0]);
	        Arrays.stream(array).forEach(i-> System.out.println(i));
	        //returns a sequential Stream with the elements of the array, passed as parameter
	    }

}
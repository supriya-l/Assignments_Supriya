import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;

public class Java11Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String file = Files.readString(Path.of("D:\\studentlist.txt"));
			List<String> l = file.lines().collect(Collectors.toList());
			int num = 0;
			for (String s:l) {
				if(s.isBlank())
					continue;
				System.out.println(s);
				num++;
			}
			System.out.println("Total students are: "+num);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
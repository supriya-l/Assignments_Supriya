import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.*;
import java.io.IOException;
import java.lang.*;

public class Java11Q6 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String uri = "https://httpbin.org/get";
		URL obj = new URL(uri);
		URLConnection con = obj.openConnection();
		Map<String, List<String>> map = con.getHeaderFields();
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(uri)).GET().build();
		HttpClient client = HttpClient.newBuilder().build();
		try {
			HttpResponse<String> r = client.send(request, BodyHandlers.ofString());
			for (Map.Entry<String, List<String>> entry : map.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
			System.out.println(r.statusCode());
			System.out.println(r.body());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
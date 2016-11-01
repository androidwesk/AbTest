import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class AbTest {

	public static void main(String[] args) {

		// say hello

		
		getNetData("http://www.baidu.com");
	}

	public static void getNetData(String url) {

		try {
			HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
			con.setReadTimeout(6000);
			con.setRequestMethod("GET");
			InputStream in = con.getInputStream();
			BufferedReader  bufferedReader=new BufferedReader(new InputStreamReader(in));
			String line="";
			StringBuffer buffer=new StringBuffer();
			while ((line=bufferedReader.readLine())!=null) {

				buffer.append(line);
			}
			
  System.out.println(buffer.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

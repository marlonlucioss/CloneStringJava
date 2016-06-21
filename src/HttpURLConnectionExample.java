import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpURLConnectionExample {
	
	
	public String sendGet(String url) throws Exception {
		
		URL obj = new URL(url);
		
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		 
		InputStream crunchifyStream = con.getInputStream();
		String crunchifyResponse = crunchifyGetStringFromStream(crunchifyStream);
		
		return crunchifyResponse;

	}
	
	private static String crunchifyGetStringFromStream(InputStream crunchifyStream) throws IOException {
		if (crunchifyStream != null) {
			Writer crunchifyWriter = new StringWriter();
 
			char[] crunchifyBuffer = new char[2048];
			try {
				Reader crunchifyReader = new BufferedReader(new InputStreamReader(crunchifyStream, "UTF-8"));
				int counter;
				while ((counter = crunchifyReader.read(crunchifyBuffer)) != -1) {
					crunchifyWriter.write(crunchifyBuffer, 0, counter);
				}
			} finally {
				crunchifyStream.close();
			}
			return crunchifyWriter.toString();
		} else {
			return "No Contents";
		}
	}
}

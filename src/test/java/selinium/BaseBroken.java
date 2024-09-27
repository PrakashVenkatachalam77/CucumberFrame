package selinium;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseBroken {

	public static void linkbase(String abc) {

		try {

			HttpURLConnection Link;
			URL mn=new URL(abc);
			Link= (HttpURLConnection) mn.openConnection();
			Link.connect();

			int code = Link.getResponseCode();

			if(code>=400) {
				System.out.println("Broken URL is "+ abc);
			}

			else {
				System.out.println("Working URL is "+abc);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

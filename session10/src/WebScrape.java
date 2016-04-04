import java.net.*;
import java.io.*;

public class WebScrape {
	public static void main(String[] args) {
		try {
			URL yahooFinance = new URL("http://download.finance.yahoo.com/d/quotes.csv?s=BIDU,AAPL,MSFT,GOOG,XOM,BP,BRK-A&f=sl1d1t1c1ohgv&e=.csv");
			URLConnection conn = yahooFinance.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(
	                                    conn.getInputStream()));
			String inputLine;
			while ((inputLine = in.readLine()) != null) 
				System.out.println(inputLine);
			in.close();
		} catch (MalformedURLException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();			
		}
	}
}

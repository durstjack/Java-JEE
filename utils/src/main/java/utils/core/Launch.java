package utils.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

public class Launch {

	private static final String USER_AGENT = "Mozilla/5.0";

	public static void main(String[] args) throws IOException {
		Scanner reader = new Scanner(System.in);
		System.out.println("type the website url below :");
		String saisie = reader.nextLine();

		Site s = extractSiteFromUserCommand(saisie);

	}

	private static Site extractSiteFromUserCommand(String saisie)
			throws IOException {
		Site site = new Site();

		if (StringUtils.isNotEmpty(saisie)) {

			String url = "http://www." + saisie;

			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(url);

			// add request header
			request.addHeader("User-Agent", USER_AGENT);
			HttpResponse response = client.execute(request);
			int statusCode = response.getStatusLine().getStatusCode();
			System.out.println("Response Code : " + statusCode);
			BufferedReader rd = new BufferedReader(new InputStreamReader( response.getEntity().getContent()));

			StringBuffer result = new StringBuffer();
			String line = "";
			while ((line = rd.readLine()) != null) {
				result.append(line);
				System.out.println(line);
			}
			Page firstPage = new Page();
			int status;
			firstPage.setStatus(statusCode);
			firstPage.setContent(result.toString());
			firstPage.setSize(result.length());
			site.getPages().add(firstPage );
			site.setUrl(url);

		}

		return site;
	}

}

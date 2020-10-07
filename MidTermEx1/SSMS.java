package MidTermEx1;

import java.io.BufferedReader;

import java.io.IOException;

import java.io.InputStreamReader;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class SSMS {
	public static void igoreVerify() throws Exception {

		ignoreVerifyHttpsTrustManager();
		ignoreVerifyHttpsHostName();
	}

	public static void ignoreVerifyHttpsHostName() {
		HostnameVerifier hv = new HostnameVerifier()

		{

			public boolean verify(String urlHostName, SSLSession session)

			{

				System.out.println("Warning: URL Host: " + urlHostName + " vs. " + session.getPeerHost());

				return true;

			}

		};

		HttpsURLConnection.setDefaultHostnameVerifier(hv);
	}

	public static void ignoreVerifyHttpsTrustManager() throws Exception {
		TrustManager[] trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(java.security.cert.X509Certificate[] certs, String authType) {
			}
		} };

		SSLContext sc = SSLContext.getInstance("SSL");
		sc.init(null, trustAllCerts, new java.security.SecureRandom());
		HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
	}

	public static void main(String[] args) throws Exception {

// TODO Auto-generated method stub

		try {
			SSMS.igoreVerify();
			URL urlCSV = new URL("https://rate.bot.com.tw/xrt/flcsv/0/2019-05/USD");
			// URL urlCSV = new
			// URL("https://drive.google.com/uc?export=download&id=104TGHQTGCUVbMPy0Y_XRYAlN7REsKfyy");

			URLConnection urlConn;

			urlConn = urlCSV.openConnection();

			InputStreamReader inputCSV = new InputStreamReader(((URLConnection) urlConn).getInputStream());

			BufferedReader br = new BufferedReader(inputCSV);

			String line = "";

			while ((line = br.readLine()) != null) {

				System.out.println("line : " + line);

			}

			br.close();

		} catch (MalformedURLException e) {

// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}

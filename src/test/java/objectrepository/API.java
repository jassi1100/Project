package objectrepository;

import java.io.IOException;
import java.security.SecureRandom;
import java.security.Security;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import javax.ws.rs.DELETE;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.poi.ss.formula.functions.Replace;
import org.eclipse.jetty.websocket.api.StatusCode;
import org.glassfish.jersey.client.JerseyClientBuilder;
import org.glassfish.jersey.client.JerseyWebTarget;
import org.glassfish.jersey.client.RequestProcessingInitializationStage;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gargoylesoftware.htmlunit.WebConsole.Logger;
import com.gargoylesoftware.htmlunit.javascript.host.fetch.Response;
import com.gargoylesoftware.htmlunit.javascript.host.xml.FormData;
import com.relevantcodes.extentreports.LogStatus;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.RequestBuilder;
import com.sun.jersey.api.client.UniformInterfaceException;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.WebResource.Builder;
import com.sun.jersey.api.client.filter.LoggingFilter;
import com.sun.jersey.api.representation.Form;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import config.FrameworkException;
import config.TestSetup;
import reusablecomponents.TechnicalComponents;
import reusablecomponents.Utilities;

public class API extends TestSetup {
	private static boolean generateLogs = true;
	public static String token,statusCode,processAuthResponse;

	private String executeAPI(String basePath, String apiType, String inputLoad, Map<String, String> header,
			String application, String apiName) throws FrameworkException {
		String endPoint = "";
		if (application.toLowerCase().equals("okta") || application.toLowerCase().equals("oktaauth")) {
			if (application.toLowerCase().equals("oktaauth")) {
				endPoint = Utilities.getProperty("OKTAAUTH-END-POINT");
				header.put("Authorization", Utilities.getProperty("OKTA_API_TOKEN"));
			} else {
				endPoint = Utilities.getProperty("OKTA-END-POINT");
				header.put("Authorization", Utilities.getProperty("OKTA_API_TOKEN"));
			}

		} else if (application.toLowerCase().equals("salesforce")) {
			endPoint = Utilities.getProperty("API-END-POINT_SALESFORCE");

		} else if (application.toLowerCase().equals("application")) {
			endPoint = Utilities.getProperty("API-END-POINT");
		} else if (application.toLowerCase().equals("cloudcraze")) {
			endPoint = Utilities.getProperty("API-END-POINT-CLOUDCRAZETOKEN");
		} else if (application.toLowerCase().equals("cci")) {
			endPoint = Utilities.getProperty("API-END-POINT-CCI");;
		}
		endPoint += basePath;
		JSONObject jobj = null;
		Client client = Client.create();

		// WebResource webResource = client.resource(endPoint);
		RequestBuilder<Builder> webResource = client.resource(endPoint);
		

		if (header != null) {
			Iterator itr = header.entrySet().iterator();
			while (itr.hasNext()) {
				Map.Entry<String, String> value = (Map.Entry<String, String>) itr.next();
				webResource = webResource.header(value.getKey(), value.getValue());
			}
		}

		ObjectMapper mapper = new ObjectMapper();

		if (inputLoad != "") {
			jobj = new JSONObject(inputLoad);
			if (generateLogs) {
				logger.log(LogStatus.INFO, "Load: " + jobj.toString());
			}

		}

		ClientResponse response;
		if (generateLogs) {
			logger.log(LogStatus.INFO, "Hitting end point (" + apiName + " - " + apiType + "): " + endPoint);
		}

		try {
			if (apiType.toLowerCase().equals("get")) {
				response = webResource.accept("application/json").get(ClientResponse.class);
			} else if (apiType.toLowerCase().equals("put")) {
				if (inputLoad != "") {
					response = webResource.accept("application/json").type("application/json").put(ClientResponse.class,
							jobj.toString());
				} else {
					response = webResource.accept("application/json").type("application/json")
							.put(ClientResponse.class);
				}
			} else if (apiType.toLowerCase().equals("post")) {
				response = webResource.accept("application/json").type("application/json").post(ClientResponse.class,
						jobj.toString());
				// response = webResource.accept("application/json").post(ClientResponse.class,
				// jobj.toString());
			} else if (apiType.toLowerCase().equals("delete")) {
				if (inputLoad != "") {
					response = webResource.accept("application/json").delete(ClientResponse.class, jobj.toString());
				} else {
					response = webResource.accept("application/json").delete(ClientResponse.class);
				}
			} else {
				response = webResource.accept("application/json").get(ClientResponse.class);
			}
			// logger.log(LogStatus.INFO,"actual response :" + response);
			try {
				if (response.getHeaders().get("Token").toString().replace("[", "").replace("]", "") != "") {
					String token = response.getHeaders().get("Token").toString().replace("[", "").replace("]", "");
				}
			} catch (NullPointerException e) {

			}
			statusCode = Integer.toString(response.getStatus());
			if (generateLogs) {
				logger.log(LogStatus.INFO, apiName + " returned response code - " + statusCode);
			}

			processAuthResponse = response.toString();
			return response.getEntity(String.class);
		} catch (UniformInterfaceException e) {
			return "";
		}
	}

	
	public void doTrustToCertificates() throws Exception {
        Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        TrustManager[] trustAllCerts = new TrustManager[]{
                new X509TrustManager() {
                    public X509Certificate[] getAcceptedIssuers() {
                        return null;
                    }

                    public void checkServerTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                        return;
                    }

                    public void checkClientTrusted(X509Certificate[] certs, String authType) throws CertificateException {
                        return;
                    }
                }
        };

        SSLContext sc = SSLContext.getInstance("SSL");
        sc.init(null, trustAllCerts, new SecureRandom());
        HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        HostnameVerifier hv = new HostnameVerifier() {
            public boolean verify(String urlHostName, SSLSession session) {
                if (!urlHostName.equalsIgnoreCase(session.getPeerHost())) {
                    System.out.println("Warning: URL host '" + urlHostName + "' is different to SSLSession host '" + session.getPeerHost() + "'.");
                }
                return true;
            }
        };
        HttpsURLConnection.setDefaultHostnameVerifier(hv);
    }

	public API() {
		try {
			doTrustToCertificates();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
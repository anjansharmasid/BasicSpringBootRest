package com.thomascook.testapi;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
public class RunApp {

	@RequestMapping("/")
	String home() {
		String message = "<h1>  Email has been sent succesufully.  </h1>";
		try {
			makePostWithHeader();
		}
		catch (Exception e) {
			message = "<h1>  Sorry failed to send email.  </h1>";
			e.printStackTrace();
		}
		return message;
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RunApp.class, args);
	}

	
	// Call this method from your controller.
	private void makePostWithHeader() {		
		
		// Change this accordingly 
		String urlPost = new String("http://communication-api-integration.integration.thomascook.io:8000/mail/hotel-everywhere-user-account-create");
		String from="anjan.sharma@thomascook.com";
		String to="anjansharmasid@gmail.com";
		String subject="Test email";
		String name="Anjan";
		String login_url="www.google.com";
		String message="Test Message";
		String goodbyemessage="Test goodbye message";
		String x_site_id = "uk";
		String x_language_id = "en-HE";
		
		// Body 
		Email email = new Email (from,to,subject);
		Data data = new Data(name,login_url,message,goodbyemessage);
		RequestBody requestBody = new RequestBody(email,data);
		
		// Header
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("Cache-Control", "no-cache");
		headers.add("Content-Type", "application/json");
		headers.add("x-site-id", x_site_id);
		headers.add("x-language-id", x_language_id);
		
		
		RestTemplate restTemplate =  new RestTemplateBuilder().build();
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		HttpEntity<RequestBody> request = new HttpEntity<RequestBody>(requestBody, headers);
		System.out.println(request.toString());
		restTemplate.postForObject(urlPost, request, RequestBody.class);

	}
}
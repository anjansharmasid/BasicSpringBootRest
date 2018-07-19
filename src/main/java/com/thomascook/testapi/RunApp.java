package com.thomascook.testapi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@ComponentScan(basePackages = {"com.thomascook.testapi","com.thomascook.testapi.controller"})
@RestController
@EnableAutoConfiguration
public class RunApp {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RunApp.class, args);
	}
}
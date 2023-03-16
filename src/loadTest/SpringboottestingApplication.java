package com.springboottesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
@SpringBootApplication
public class SpringboottestingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringboottestingApplication.class, args);
 
	        WebClient client = WebClient.create("http://107.155.116.31:9876");

	        Mono<String> response = client.get()
	                .uri("/hello")
	                .retrieve()
	                .bodyToMono(String.class);

	        response.subscribe(System.out::println);
	    
	}

}

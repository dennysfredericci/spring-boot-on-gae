package ca.fredericci.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a simple rest controller example
 * 
 * @author dennys.fredericci
 */
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Welcome to Spring Boot on Google App Engine!";
	}

}

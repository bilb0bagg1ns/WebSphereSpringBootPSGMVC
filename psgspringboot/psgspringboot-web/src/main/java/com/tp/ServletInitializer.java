package com.tp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Sourced From: All related posts by same author
 * 
 * http://www.adeveloperdiary.com/java/spring-boot/an-introduction-to-spring-boot/
 * http://www.adeveloperdiary.com/java/spring-boot/create-spring-boot-application-step-step/
 * http://www.adeveloperdiary.com/java/spring-boot/create-restful-webservices-using-spring-boot/
 * http://www.adeveloperdiary.com/java/spring-boot/deploy-spring-boot-application-ibm-liberty-8-5/
 * 
 *
 */
@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(ServletInitializer.class, args);
	 * }
	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ServletInitializer.class);
	}
}

@RestController
class RESTController {

	@RequestMapping("/")
	public String hello() {
		return "<H1>Spring final Boot Application from adeveloperdiary.com</H1>";
	}

	@RequestMapping(value = "/student", method = RequestMethod.GET)
	public ModelAndView student() {

		return new ModelAndView("student", "command", new Student());
	}

	@RequestMapping(value = "/payment", method = RequestMethod.GET)
	public ModelAndView payment(HttpServletRequest request) {

		return new ModelAndView("payment", "command", new Payment());
	}

}
package com.wildcodeschool.myProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class MyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectApplication.class, args);
	}

	@RequestMapping("/")
	@ResponseBody
	public String index() {
		return "<ul>" +
					"<li><a href ='/doctor/1'/>First Doctor</a></li>" +
					"<li><a href ='/doctor/2'/>Second Doctor</a></li>" +
					"<li><a href ='/doctor/3'/>Third Doctor</a></li>" +
					"<li><a href ='/doctor/1'/>Fourth Doctor</a></li>" +
				"<ul>";

	}

	@RequestMapping("/doctor/1")
	@ResponseBody
	public String firstDoctor() {
		return "William Hartnell";
	}

	@RequestMapping("/doctor/2")
	@ResponseBody
	public String secondDoctor() {
		return "David Tennant";
	}

	@RequestMapping("/doctor/3")
	@ResponseBody
	public String thirdDoctor() {
		return "Jodie Whittaker";
	}

	@RequestMapping("/doctor/4")
	@ResponseBody
	public String fourthDoctor() {
		return "Tom Baker";
	}

}

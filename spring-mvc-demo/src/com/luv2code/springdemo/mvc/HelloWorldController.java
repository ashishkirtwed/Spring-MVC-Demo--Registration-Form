package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	//need a controller method to show the initial HTML form
	@RequestMapping("/showForm") 
	 public String showForm() {
		 return "helloworld-form";
	 }
	//need a controller method to process the HTML form
	@RequestMapping("/processForm")
	 public String processForm() {
		 return "helloworld";
	 }
	
	//new a controller method to read form data and add data to the model 
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		
		//read the request parameter from the HTML form
		
		String theName = request.getParameter("studentName");
		
		// Convert the data to all caps
		theName = theName.toUpperCase();
		
		// Create the message 
		String theResult = "Yo!! "+theName;
		
		// add message to the model 
		model.addAttribute("message", theResult);
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName,Model model) {
		// Convert the data to all caps
		theName = theName.toUpperCase();
		
		// Create the message 
		String theResult = "Hey my Friend !! "+theName;
		
		// add message to the model 
		model.addAttribute("message", theResult);
		
		return "helloworld";
		
	}
}

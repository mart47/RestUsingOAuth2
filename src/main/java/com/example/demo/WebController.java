package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;

public class WebController {
	
	@RequestMapping({"/","index"})
	  public String initialize() {
	    return "index";
	  }

	 @RequestMapping("/private")
	  public String privatePage() {
	    return "private";
	  }
	 @RequestMapping("/public")
	  public String publicPage() {
	    return "public";
	  }
	 @RequestMapping("/adminPage")
	  public String admin() {
	    return "admin";
	  }
	 @RequestMapping("/login")
	  public String login() {
	    return "login";
	  }
}

package com.mycom.ssrs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	 @RequestMapping("/")
	    public String rootContextPathAccess() {
	      return "redirect:/students/list";
	    }

	
}

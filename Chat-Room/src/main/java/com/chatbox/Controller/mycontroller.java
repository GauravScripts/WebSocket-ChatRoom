package com.chatbox.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class mycontroller {
	
	
    @RequestMapping(value = "/",method=RequestMethod.GET)
	public String about() {
		
		System.out.println("working...");
		return "about";
	}

}

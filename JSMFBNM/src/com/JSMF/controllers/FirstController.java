package com.JSMF.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FirstController {

	@RequestMapping("/")
	public static void welcome()
	{
		System.out.println("Hello first line is called");
		
	}
	
	
}

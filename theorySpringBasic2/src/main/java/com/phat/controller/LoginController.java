package com.phat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Login")
public class LoginController {

	@GetMapping
	public String Default() {
		return "Login";
	}
	
	@PostMapping
	public String Login(@RequestParam String Username,@RequestParam String Password) {
		if(Username.equals("1") && Password.equals("1"))
		{
			return "redirect:/Jstl";
			
		}
		 return "redirect:/homepage";
		
		
	}
	
}

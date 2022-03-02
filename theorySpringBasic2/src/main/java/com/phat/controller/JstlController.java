package com.phat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Jstl")
public class JstlController {

	@GetMapping
	public String Default(ModelMap modelMap)
	{
		modelMap.addAttribute("Login", "Login Success");
		return "Jstl";
	}
}

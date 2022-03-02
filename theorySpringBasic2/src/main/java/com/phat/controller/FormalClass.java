package com.phat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class FormalClass {
	@GetMapping
	public String Default()
	{
		return "FormalHomePage";
	}
	@GetMapping("/{name}")
	public String ReceiveName(@PathVariable String name,ModelMap modelMap)
	{
		modelMap.addAttribute("name", name);
		return "FormalHomePage";
	}
}

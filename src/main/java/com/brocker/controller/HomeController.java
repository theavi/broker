package com.brocker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String login(Model model) {

		model.addAttribute("name", "John Doe");
		System.out.println("LOGIN INITIATED");
		return "login";
	}
}

package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value = "/hello")
	public String sayHello(Model model) {
		model.addAttribute("nom", "Wick");
		for (int i=0;i<10;i++)
			if (i==7) continue;
		else System.out.println(i);
		return "jsp/hello";
	}
}

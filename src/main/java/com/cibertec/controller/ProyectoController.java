package com.cibertec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProyectoController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting"; // Carga la vista greeting.html
	}
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	@GetMapping("/abaout")
	public String abaout() {
		return "abaout";
	}
	@GetMapping("/products")
	public String products() {
		return "products";
	}



}
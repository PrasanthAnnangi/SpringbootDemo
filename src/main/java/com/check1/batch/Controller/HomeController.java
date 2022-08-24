package com.check1.batch.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String firstmethod() {
		return "Hello Prasanth";
	}
}

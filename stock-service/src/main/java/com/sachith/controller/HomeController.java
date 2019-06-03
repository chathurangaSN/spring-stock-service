package com.sachith.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value ="/")
	public String greeting() {
		return "<h1> Wel come to Developing World..</h1>";
	}

}

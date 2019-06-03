package com.sachith.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/inventorycloud")
public class StockController {
	@RequestMapping(value ="/")
	public String greeting() {
		return "<h1> hello Sachith..</h1>";
	}

}

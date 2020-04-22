package com.thornBird.sbd.modules.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
		
	@RequestMapping("/api/test/desc")
	public String getAppDesc(){
		return "this is spring boot app.";
	}
}

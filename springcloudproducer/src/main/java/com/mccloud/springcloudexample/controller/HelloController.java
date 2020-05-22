package com.mccloud.springcloudexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value="/azurecicd")
//@ComponentScan(basePackages = {"com.mccloud.springcloudexample.controller"})
public class HelloController {
	
	@GetMapping(value="/hello{message}")
	public String sayHello(@RequestParam(defaultValue = "CICD") String message) {
		return "Hello Cyril !!! Welcome to world of Spring through" + message;
	}

}

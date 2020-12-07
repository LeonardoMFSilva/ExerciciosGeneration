package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * 
 * import org.springframework.web.bind.annotation.*;
 */

/*@RestController
@RequestMapping("/Hello")*/

@RestController
@RequestMapping ("/Hello")
public class HelloController {
	
	@GetMapping
	public String Hello() {
		return "Hello Generation";
	}

}

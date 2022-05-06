package com.slokam.demo;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {
	
	
	@GetMapping("getData")
	public String getData(String name){
		
		
		
		System.out.println(name);
		
		
		
		return name;
	}

}

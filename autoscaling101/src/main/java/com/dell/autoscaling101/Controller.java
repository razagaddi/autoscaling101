package com.dell.autoscaling101;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/resources")
	public String getSomething() {
		System.out.println(" Getting Resources");
		try {
			Thread.sleep(5000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String resource = " Getting Resources";
		System.out.println(resource);
		return resource;
		
		
	}

}

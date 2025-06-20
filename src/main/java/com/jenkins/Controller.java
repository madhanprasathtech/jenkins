package com.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
		@GetMapping
		public String getname() {
			return "hello";	
			}
		@GetMapping
		public String get() {
			return "world";
		}
}

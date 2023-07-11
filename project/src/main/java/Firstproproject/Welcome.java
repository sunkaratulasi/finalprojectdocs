package Firstproproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
	
	@GetMapping("/get")
	public String getData() {
		return "welcome to my presentation";
	}

}


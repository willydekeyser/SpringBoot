package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelkomController {

	@GetMapping("/")
	public String welkom() {
		return "Welkom op deze website";
	}
}

package willydekeyser.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelkomController {
	
	@GetMapping("/info")
	public String info() {
		return "info";
	}
}

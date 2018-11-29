package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelkomController {

	@GetMapping("/")
	public String welkom() {
		return "<h1>Welkom op deze website</h1><p>Test op Heroku</p><p>Willy De Keyser</p>";
	}
}

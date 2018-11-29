package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String welkom() {
		return "<h1>Welkom op deze website</h1>"
				+ "<p>Test op Heroku</p>"
				+ "<p>Willy De Keyser</p>"
				+ "<a href='info'>INFO</a>";
	}
}

package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String welkom() {
		return "<h1>Welkom op deze website<br>Computerclub Format C</h1>"
				+ "<p>Test op CloudJiffy AUTO deploy: ON</p>"
				+ "<p>Willy De Keyser</p>"
				+ "<p>10:44</p>"
				+ "<a href='info'>INFO</a>";
	}
}

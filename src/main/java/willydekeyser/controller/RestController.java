package willydekeyser.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

	@GetMapping("/")
	public String welkom() {
		return "<h1>Welkom op deze website<br>Computerclub Format C</h1>"
				+ "<p>Test op Heroku</p>"
				+ "<p>Willy De Keyser 03/12/2018</p>"
				+ "<a href='info'>INFO</a>";
	}
}

package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@GetMapping("/welcome")
	public String WeclomeController()
	{
		return "Hi Welcome Back";
	}

}

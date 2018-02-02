package us.co.state.sos.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.tp.service.LoginService;

@Controller
public class PSGMVCController {

	@Autowired
	LoginService service;

	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		final String message = "<br><div style='text-align:center;'>" + "<h3>Welcome to PSG Page</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showWelcomePage(ModelMap model, @RequestParam String name, @RequestParam String password) {

		final boolean isValidUser = service.validateUser(name, password);

		if (!isValidUser) {
			model.put("errorMessage", "Invalid Credentials");
			return "login";
		}

		model.put("name", name);
		model.put("password", password);

		return "welcome";
	}
}

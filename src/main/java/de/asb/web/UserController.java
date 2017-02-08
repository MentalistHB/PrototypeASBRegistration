package de.asb.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class UserController {
	public String index(Model model){
		return "index";
	}
}

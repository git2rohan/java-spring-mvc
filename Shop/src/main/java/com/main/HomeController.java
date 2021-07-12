package com.main;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String getHomePage() {
		
		return "home";
	}
	
	@RequestMapping("/processOrder")
	public String sumittedOrder(HttpServletRequest request, Model model) {
		if(request.getParameter("customer_order")!="" && request.getParameter("customer_name")!="" && request.getParameter("customer_email")!="")
		{
			model.addAttribute("customer_name", request.getParameter("customer_name"));
			model.addAttribute("email", request.getParameter("customer_email"));
			model.addAttribute("customer_order", request.getParameter("customer_order"));
			return "lobby";
		}
		else {
			return "home";
		}
		
	}
}

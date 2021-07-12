package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/nonveg")
public class NonVegController {

	@ResponseBody //We use it to send Literal values as response eg. String
	@RequestMapping("/getFood")
	public String getFood(@RequestParam String id)
	{
		return "Prepare non veg food, id = " + id;
	}
}

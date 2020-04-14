package com.test.wrui.TestController;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
@RequestMapping("/testTest")
public class TestController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	@ResponseBody
	public String checkOk() {
		return "hello wrui";
	}

}

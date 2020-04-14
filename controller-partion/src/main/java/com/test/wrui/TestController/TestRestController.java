package com.test.wrui.TestController;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testRest")
public class TestRestController {
	@ResponseBody
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public Boolean testOk() {
		return true;
	}

}

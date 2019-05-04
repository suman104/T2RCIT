package com.tcs.T2RCIT.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping(path="/appName")
	public String getAppName() {
		return "T2RCIT";
	}
}

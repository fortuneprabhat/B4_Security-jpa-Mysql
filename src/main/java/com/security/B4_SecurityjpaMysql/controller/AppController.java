package com.security.B4_SecurityjpaMysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String home() {
		return "<h1>Root Page<h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/admin")
	public String admin() {
		return "<h1>welcome admin<h1>";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/user")
	public String user() {
		return "<h1>welcome user<h1>";
	}
}

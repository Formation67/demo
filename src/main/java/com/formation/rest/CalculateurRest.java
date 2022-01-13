package com.formation.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.formation.service.Calculator;

@RestController
public class CalculateurRest {
	
	@Autowired
	private Calculator calculator;
	
	@RequestMapping("/sum")
	public String sum(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
		return String.valueOf(calculator.sum(a, b));
	}
	
	@RequestMapping("/mult")
	public String multiply(@RequestParam("a") Integer a,@RequestParam("b") Integer b) {
		return String.valueOf(calculator.multiply(a, b));
	}

}

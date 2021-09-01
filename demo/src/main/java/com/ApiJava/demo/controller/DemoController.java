package com.ApiJava.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiJava.demo.bean.Persona;
@RestController
@RequestMapping("/demo")
public class DemoController {
	
	@RequestMapping(Value="/person", method = RequestMethod.GET)

	public Persona obtenerPersona(HttpServletRequest request) {
		persona person = new Persona();
		person.setNombre("Peter");
		person.setApellido("Parker");
		person.setDocumento("23321");
return person;
	}
}

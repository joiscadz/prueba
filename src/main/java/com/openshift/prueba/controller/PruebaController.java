package com.openshift.prueba.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.openshift.prueba.dao.PruebaDao;

@RestController
@RequestMapping(value = "/autos")
public class PruebaController {

	@PostMapping(value = "/agregar")

	public PruebaDao agregar(@Valid @RequestBody PruebaDao instance) {

		PruebaDao prueba = new PruebaDao();
		prueba.setMarca(instance.getMarca());
		prueba.setModelo(instance.getModelo());
		prueba.setColor(instance.getColor());

		return prueba;

	}

}

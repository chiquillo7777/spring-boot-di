package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public interface IServicio {

	public String operacion();
}

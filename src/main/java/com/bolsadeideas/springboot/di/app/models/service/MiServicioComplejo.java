package com.bolsadeideas.springboot.di.app.models.service;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//@Component
//@Qualifier("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		
		
		return "Running an important complex process";
	}

}

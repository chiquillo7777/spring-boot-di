package com.bolsadeideas.springboot.di.app.models.service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


//@Component
//@Primary
public class MiServicio implements IServicio{

	@Override
	public String operacion() {
		
		
		return "Running an important simple process";
	}

}

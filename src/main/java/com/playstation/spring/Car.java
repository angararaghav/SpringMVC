package com.playstation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.playstation.spring.Interface.Vehicle;


@Component
public class Car implements Vehicle {

	@Autowired
	private Tyre tyre;
	
	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	public void Drive()
	{ 
	     System.out.println( "Lets drive Car!" + " With " + tyre);
	}
	
}

package com.playstation.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.playstation.spring.Interface.Stereo;
import com.playstation.spring.Interface.Vehicle;

@Component
public class Truck implements Vehicle{
	
	@Autowired
	private Stereo type;
	

	public Stereo getType() {
		return type;
	}


	public void setType(Stereo type) {
		this.type = type;
	}


	public void Drive()
	{
	     System.out.println( "Lets drive Truck!" );
	     type.Type();
	}
	

}

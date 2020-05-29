package com.playstation.spring;
import org.springframework.stereotype.Component;

import  com.playstation.spring.Interface.*;

@Component
public class Dolby implements Stereo{
	
	public void Type()
	{
		System.out.println("Stereo type is Dolby");
	}

}

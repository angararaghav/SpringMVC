package com.playstation.spring;
import com.playstation.spring.Interface.Stereo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.playstation.spring.Truck")
public class AnnotationConfig {

	@Bean
	public Truck Drive()
	{
	    return new Truck();
	}
	 
	@Bean
	public Stereo getType()
	{
	    return new Dolby();
	}
	 
}

package com.springmvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.springmvc"})
public class SpringMVCServletConfig {

	@Bean
	public InternalResourceViewResolver viewResolver()
	{
	 InternalResourceViewResolver objirvResolver = new InternalResourceViewResolver();
	 objirvResolver.setPrefix("/");
	 objirvResolver.setSuffix(".jsp");
	 return objirvResolver;
	}
}

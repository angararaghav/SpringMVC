package com.playstation.spring;

import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.playstation.spring.Interface.Vehicle;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Annotation();
        
    }
    
    static void UsingBean()
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        
        
        Vehicle objVehicle = (Vehicle) context.getBean("truck");
        objVehicle.Drive();
        
        Vehicle objVehicle2 = (Vehicle) context.getBean("car");
        objVehicle2.Drive();
         
         
         Tyre objTyre = (Tyre) context.getBean("tyre");
         System.out.println( objTyre );
    }
    
    static void Annotation()
    {
    	 ApplicationContext factory = new AnnotationConfigApplicationContext(AnnotationConfig.class);
    	    Vehicle objVehicle = (Vehicle) factory.getBean(Truck.class);
    	       objVehicle.Drive();
    }
    
}

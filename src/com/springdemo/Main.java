package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(IocConfig.class);
		ICustomerService service = context.getBean("service",ICustomerService.class);
		
		//Bana ICustomerDal için "database"'de ne yazýyorsa onu new'le ver demektir. 
		service.add();
		

		


	}

}

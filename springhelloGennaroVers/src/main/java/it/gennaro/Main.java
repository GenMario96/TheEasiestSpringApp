package it.gennaro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.gennaro.spring.Config;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Automobile automobile = context.getBean( Automobile.class);
		System.out.println(automobile);
		
		
	}

}

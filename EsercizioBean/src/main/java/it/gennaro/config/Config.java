package it.gennaro.config;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.gennaro.Calcolatrice;
import it.gennaro.Operazione;



@Configuration
@ComponentScan(basePackageClasses = Calcolatrice.class)


public class Config {
	
	
	
	@Bean
    public Operazione getOperazione() {
		
	Operazione o = new Operazione(0, 0);
	o.setOperazionei();
	
	return o;
		
		
		
		//return new Operazione;
		
		//return new Calcolatrice(123);
    }
}	
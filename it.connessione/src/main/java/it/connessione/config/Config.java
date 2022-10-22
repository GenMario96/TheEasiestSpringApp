package it.connessione.config;

import java.sql.ResultSet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.connessione.Connessione;




@Configuration
@ComponentScan(basePackageClasses = Connessione.class)


public class Config {
	@Bean
    public	Connessione getConnessione() {
		
		return new Connessione();
	
		
    }
}	
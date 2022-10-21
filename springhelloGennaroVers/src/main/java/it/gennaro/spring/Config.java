package it.gennaro.spring;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import it.gennaro.Automobile;
import it.gennaro.Motore;

@Configuration
@ComponentScan(basePackageClasses = Automobile.class)


public class Config {
	Scanner s = new Scanner(System.in);
	String motore= null;
	@Bean
    public Motore getMotore() {
		System.out.println("Inserisci la cilindrata");
		motore = s.nextLine();
        return new Motore(motore);
    }
}
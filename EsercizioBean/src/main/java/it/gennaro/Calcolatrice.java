package it.gennaro;

import java.util.Scanner;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Calcolatrice {
	
	Operazione operazione;


	Scanner s = new Scanner(System.in);
	
	
	public Calcolatrice(Operazione operazione) {
		
		
	this.operazione=operazione;
	
	
	}


		
	public double Calcolo() {
		
	double addendo1 = operazione.getAddendo1();
	double addendo2 = operazione.getAddendo2();
	String scelta = operazione.getScelta();
	double risultato =0;
			
if(scelta.equals("1"))
{
		risultato = addendo1+addendo2;
}
		
		return risultato;
	
	}
	

	
	
	
	
}


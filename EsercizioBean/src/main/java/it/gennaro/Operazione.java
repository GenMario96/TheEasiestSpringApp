package it.gennaro;

import java.util.Scanner;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Operazione {

	double addendo1;
	double addendo2;
	String scelta;
	
//	double risultato;
	
	Scanner s = new Scanner(System.in);
	Calcolatrice c = new Calcolatrice(null);
	public Operazione (double addendo1, double addendo2)
	{
		this.addendo1=addendo1;
		this.addendo2=addendo2;
		//this.risultato=risultato;

		
	}
	
	public void setOperazionei() {
		
		
		
		
	
		
		System.out.println("Inserisci il primo valore");
		this.addendo1 = Integer.parseInt(s.nextLine());
		System.out.println("Inserisci il secondo valore");
		this.addendo2 = Integer.parseInt(s.nextLine());
		
		System.out.println("Quale operazione vuoi fare?");
		this.scelta = s.nextLine();
		
		if(this.scelta.equals("1"))
		{
			//this.risultato = c.Calcolo();
			
		}
		
	}
	
}

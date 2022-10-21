package it.gennaro;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Motore {
	
	private String cilindrata;
	
	public Motore(String cilindrata) {
		
		this.cilindrata=cilindrata;
	}
	/*
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }
*/
}
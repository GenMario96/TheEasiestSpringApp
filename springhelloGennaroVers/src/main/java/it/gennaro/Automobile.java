package it.gennaro;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
public class Automobile {
   
	
	private Motore motore;
	
	public Automobile(Motore motore) {
		
		this.motore=motore;
	}
	
	
	/*private Address address;

    public Company(Address address) {
        this.address = address;
    }
*/
}
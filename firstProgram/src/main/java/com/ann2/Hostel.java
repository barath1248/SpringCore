package com.ann2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Hostel {
	
	private Electricity electricity;
	
	
	private Beds bed;
    
    
	public void setElectricity(Electricity electricity) {
		System.out.println("Setter for electricity");
		this.electricity = electricity;
	}
    
	public void setBed(Beds bed) {
		System.out.println("Setter for bed");
		this.bed = bed;
	}

	public Hostel(Beds bed) {
		super();
		this.bed = bed;
	}
 
	public Hostel(Electricity electricity) {
		super();
		this.electricity = electricity;
	}
    
    @Autowired
	public Hostel(Electricity electricity, Beds bed) {
		super();
		System.out.println("Constructor for bed and elec");

		this.electricity = electricity;
		this.bed = bed;
	}



	public Hostel() {
		super();
	}
	
	@Override
	public String toString() {
		return "Hostel [electricity=" + electricity + ", bed=" + bed + "]";
	}

}

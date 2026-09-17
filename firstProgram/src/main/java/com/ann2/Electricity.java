package com.ann2;

public class Electricity {
	private int volts;

	public void setVolts(int volts) {
		this.volts = volts;
	}
   
	public Electricity() {
		super();
	}

	public Electricity(int volts) {
		super();
		this.volts = volts;
	}

	@Override
	public String toString() {
		return "Electricity [volts=" + volts + "]";
	}

}

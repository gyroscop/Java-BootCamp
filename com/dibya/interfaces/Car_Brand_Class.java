package com.dibya.interfaces;

public class Car_Brand_Class implements Car_Brand {

	private String Model;
	private String Manufacturer;

	public Car_Brand_Class() {

	}

	@Override
	public String Model(String Model) {

		return this.Model = Model;
	}

	@Override
	public String Manufacturer(String Manufacturer) {

		return this.Manufacturer = Manufacturer;
	}

}

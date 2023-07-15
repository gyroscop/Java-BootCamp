package com.dibya.interfaces;

public class Engine_Class implements Engine {

	private static final String Name = null;
	private Integer Power;
	private Integer Torque;
	private String Manufacturer;

	public Engine_Class() {

	}

	@Override
	public Integer Power(Integer Power) {

		return this.Power = Power;
	}

	@Override
	public Integer Torque(Integer Torque) {

		return this.Torque = Torque;
	}

	@Override
	public String toString() {
		return Name;
	}

	@Override
	public String Manufacturer(String Manufacturer) {

		return this.Manufacturer = Manufacturer;
	}

}

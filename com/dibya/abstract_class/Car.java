package com.dibya.abstract_class;

public class Car extends Car_Brand {

	private String Model;
	private Integer Power;
	private Integer Torque;
	private String Name;

	public Car(String Name) {
		this.Name = Name;
	}

	@Override
	public String Model(String Model) {

		return this.Model = Model;
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

}

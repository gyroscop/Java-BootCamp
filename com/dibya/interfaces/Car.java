package com.dibya.interfaces;

public class Car {

//	private String Model;
//	private Integer Power;
//	private Integer Torque;
//	private String Name;
//
//	Integer a = 100;
//	private String Manufacturer;
//
//	public Car(String Name) {
//		this.Name = Name;
//
//	}
//
//	@Override
//	public String Model(String Model) {
//
//		return this.Model = Model;
//	}
//
//	@Override
//	public Integer Power(Integer Power) {
//
//		return this.Power = Power;
//	}
//
//	@Override
//	public Integer Torque(Integer Torque) {
//
//		return this.Torque = Torque;
//	}
//

//
//	@Override
//	public String Manufacturer(String Manufacturer) {
//
//		return this.Manufacturer = Manufacturer;
//	}

	private Engine engine;
	private Car_Brand brand;
	private String Name;

	public Car() {
		engine = new Engine_Class();
		brand = new Car_Brand_Class();

	}

	public Car(String name) {
		engine = new Engine_Class();
		brand = new Car_Brand_Class();
		this.Name = name;
	}

	public Integer power(int p) {

		return engine.Power(p);
	}

	public Integer torque(int p) {

		return engine.Torque(p);
	}

	public String EngineManufacturer(String m) {
		return engine.Manufacturer(m);
	}

	public String Model(String Model) {

		return brand.Model(Model);
	}

	public String Brand_Manufacturer(String Manufacturer) {

		return brand.Manufacturer(Manufacturer);
	}

	@Override
	public String toString() {
		return Name;
	}

}

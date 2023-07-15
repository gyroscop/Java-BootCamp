package com.properties.inheritance;

public class SEP_Account extends MemberAccount {

	public SEP_Account(String name, String employerName) {
		super(name, employerName);

	}

	public SEP_Account() {
		super();
	}

//	Polymorphism

	@Override
	public String AccountType() {

		return "Self Employed Person";

	}

}

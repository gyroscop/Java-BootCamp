package com.properties.inheritance;

public class MemberAccount {

	public String name;
	public String employerName;

	public MemberAccount() {

		this.name = "Deemed";
		this.employerName = "Deemed";
	}

	public MemberAccount(String name, String employerName) {

		this.name = name;
		this.employerName = employerName;
	}

	public String AccountType() {

		return "Regular Employee";

	}

}

package com.dibya.access_modifiers;

public class Access {

	private String defaultPass = "12345";

	String passWord;

	public Access(User user) {

		// System.out.println("Please choose your password ");
		// Scanner scan = new Scanner(System.in);
		// String tempPass = scan.next();

//		if (tempPass != null) {
//			this.passWord = tempPass;
//			System.out.println("Your UserName : " + user.userName);
//			System.out.println("Your Password : " + this.passWord);
//		} else {
//			System.out.println("Your UserName : " + user.userName);
//			System.out.println("Your Password : " + this.getDefaultPass());
//		}

	}

	public String getDefaultPass() {
		return defaultPass;
	}

	public String setDefaultPass(String defaultPass) {
		this.defaultPass = defaultPass;
		return defaultPass;
	}

}

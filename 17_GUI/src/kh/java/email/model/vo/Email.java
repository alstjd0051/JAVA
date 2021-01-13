package kh.java.email.model.vo;

import java.io.Serializable;

public class Email implements Serializable {

	private String email;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Email(String s) {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Email [email=" + email + "]";
	}
	
	
}

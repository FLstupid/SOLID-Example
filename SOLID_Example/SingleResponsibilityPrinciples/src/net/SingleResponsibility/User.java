package net.SingleResponsibility;

public class User {
	private String username;
	private String password;
	
	public User(String name, String pass) {
		this.username = name;
		this.password = pass;
	}
	
	public User() {
		this.username = "Anonymous";
		this.password = "default";
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Name: " + this.username + ", Pass: " + this.password;
	}
}


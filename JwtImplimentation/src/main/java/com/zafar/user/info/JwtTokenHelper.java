package com.zafar.user.info;

public class JwtTokenHelper {
	private String username;
	private String password;
	public JwtTokenHelper(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public JwtTokenHelper() {
		super();
		// TODO Auto-generated constructor stub
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
		return "JwtTokenGenrator [username=" + username + ", password=" + password + "]";
	}
	

}

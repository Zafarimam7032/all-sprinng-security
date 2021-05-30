package com.zafar.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "UserDetailsJwtZ")
public class UserDetails {
	@Id
	@Column(name="UserID",length = 30)
	private String username;
	@Column(name="Password",length=16)
	private String password;
	@Column(name="User_Role",length=20)
	private String role;
	@Column(name="User_status",length = 10)
	private boolean status;
	
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
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "UserDetails [username=" + username + ", password=" + password + ", role=" + role + ", status=" + status
				+ "]";
	}
	
	
	

}

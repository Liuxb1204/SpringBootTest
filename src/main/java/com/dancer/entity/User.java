package com.dancer.entity;

public class User {
	private int id;
	private String username;
	private String password;
	private String email;
	private String salt;
	private String uyul;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public String getUyul() {
		return uyul;
	}
	public void setUyul(String uyul) {
		this.uyul = uyul;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", email=" + email + ", salt=" + salt + ", uyul="
				+ uyul + "]";
	}
	public User(int id, String username, String password, String email,
			String salt, String uyul) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.salt = salt;
		this.uyul = uyul;
	}
	public User() {
		super();
	}
	
}

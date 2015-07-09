package com.raidentrance.model;

public class User implements IUser {
	private String username;
	private Role role;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(IRole role) {
		if (role instanceof Role) {
			this.role = (Role) role;
		} else {
			throw new IllegalArgumentException(Role.class.getName().concat(" instance required"));
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

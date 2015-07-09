package com.raidentrance.model;

public class UserDto implements IUser {
	private String username;
	private RoleDto role;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public RoleDto getRole() {
		return role;
	}

	public void setRole(IRole role) {
		if (role instanceof RoleDto) {
			this.role = (RoleDto) role;
		} else {
			throw new IllegalArgumentException(RoleDto.class.getName().concat(" instance required"));
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

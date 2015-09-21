package com.raidentrance.model.pojo;

import com.raidentrance.model.context.IRole;
import com.raidentrance.model.context.IUser;

/**
 * @author raidentrance
 *
 */
public class User implements IUser {
	private String username;
	private IRole role;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public IRole getRole() {
		return role;
	}

	public void setRole(IRole role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}

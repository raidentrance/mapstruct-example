package com.raidentrance.model;

public interface IUser {

	public String getUsername();

	public void setUsername(String username);

	public IRole getRole();

	public void setRole(IRole role);

	public String getPassword();

	public void setPassword(String password);

}

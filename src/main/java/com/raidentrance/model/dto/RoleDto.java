package com.raidentrance.model.dto;

import com.raidentrance.model.context.IRole;

/**
 * @author raidentrance
 *
 */
public class RoleDto implements IRole {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

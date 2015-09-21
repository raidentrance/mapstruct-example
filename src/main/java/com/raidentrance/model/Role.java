package com.raidentrance.model;

import com.raidentrance.model.context.IRole;


/**
 * @author raidentrance
 *
 */
public class Role implements IRole {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

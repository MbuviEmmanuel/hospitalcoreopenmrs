package org.openmrs.module.hospitalcore.util;

public class Action {
	private Integer id;

	private String name;

	public Action(int id, String name) {
		this.id = Integer.valueOf(id);
		this.name = name;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
}

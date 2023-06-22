package com.alves.hroauth.entities;

import java.io.Serializable;
import java.util.Objects;

public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String roleName;
	
	public Role(){
	}

	public Role(Long id, String name) {
		super();
		this.id = id;
		this.roleName = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return roleName;
	}

	public void setName(String name) {
		this.roleName = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(roleName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(roleName, other.roleName);
	}
	
	
}

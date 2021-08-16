package com.laptrinhjavaweb.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class RoleEntity extends BaseEntity {
	
	@Column
	private String code;
	
	@Column
	private String name;
	
	
	// in order to create middle table and create foreign key
//	@ManyToMany => if role use this way then user use the another way, they cannot be the same
//	@JoinTable(name = "user_role", 
//				joinColumns = @JoinColumn(name = "user_id"),  // if role use this way, name of join column is join_id
//				inverseJoinColumns = @JoinColumn(name = "role_id"))
//	private List<RoleEntity> roles = new ArrayList<>(); vs private List<UserEntity> users = new ArrayList<>();
	
	
	
	@ManyToMany(mappedBy = "roles") // name of list in userEntity
    private List<UserEntity> users = new ArrayList<>(); // one role has many users

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<UserEntity> getUsers() {
		return users;
	}

	public void setUsers(List<UserEntity> users) {
		this.users = users;
	}
}

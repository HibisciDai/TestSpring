package org.fancylab.hibiscidai.entity;

public class Account {
	private Integer id;
	private String name;
	private String password;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Account(Integer id, String name, String password, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}

public Account(Integer id, Integer age) {
	super();
	this.id = id;
	this.age = age;
}

	public Account(String password, Integer age) {
		super();
		this.password = password;
		this.age = age;
	}

	public Account() {
		super();
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + "]";
	}

}
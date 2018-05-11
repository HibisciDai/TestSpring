package org.fancylab.hibiscidai.entity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private Integer id;
	private String username;
	private String password;
	private int[] tels;
	private List<String> l = new ArrayList<String>();
	private Set<String> s = new HashSet<String>();
	private Map<Integer, String> m = new HashMap<Integer, String>();
	private Properties p = new Properties(); // 特殊的Map 键值都是String类型

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int[] getTels() {
		return tels;
	}

	public void setTels(int[] tels) {
		this.tels = tels;
	}

	public List<String> getL() {
		return l;
	}

	public void setL(List<String> l) {
		this.l = l;
	}

	public Set<String> getS() {
		return s;
	}

	public void setS(Set<String> s) {
		this.s = s;
	}

	public Map<Integer, String> getM() {
		return m;
	}

	public void setM(Map<Integer, String> m) {
		this.m = m;
	}

	public Properties getP() {
		return p;
	}

	public void setP(Properties p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", tels=" + Arrays.toString(tels) + ", l=" + l
				+ ", s=" + s + ", m=" + m + ", p=" + p + ", getId()=" + getId() + ", getUsername()=" + getUsername() + ", getPassword()="
				+ getPassword() + ", getTels()=" + Arrays.toString(getTels()) + ", getL()=" + getL() + ", getS()=" + getS() + ", getM()="
				+ getM() + ", getP()=" + getP() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public User(Integer id, String username, String password, int[] tels, List<String> l, Set<String> s, Map<Integer, String> m,
			Properties p) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.tels = tels;
		this.l = l;
		this.s = s;
		this.m = m;
		this.p = p;
	}

	public User() {
		super();
	}

}
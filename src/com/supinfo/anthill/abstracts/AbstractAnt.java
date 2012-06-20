package com.supinfo.anthill.abstracts;

/**
 * @author Sebastien Magat
 * 
 */
public abstract class AbstractAnt {
	private int id;
	private int age;
	static int refId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static public int getRefId() {
		return refId;
	}

	public abstract AbstractAnt updateStatus();
}

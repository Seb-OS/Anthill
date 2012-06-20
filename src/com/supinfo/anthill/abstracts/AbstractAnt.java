/**
 * 
 */
package com.supinfo.anthill.abstracts;

/**
 * @author Sebastien Magat
 * 
 */
public abstract class AbstractAnt {
	private int id;
	private int age;
	static int totalAntsNb;

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

	public static int getTotalAntsNb() {
		return totalAntsNb;
	}

	public static void setTotalAntsNb(int totalAntsNb) {
		AbstractAnt.totalAntsNb = totalAntsNb;
	}

}

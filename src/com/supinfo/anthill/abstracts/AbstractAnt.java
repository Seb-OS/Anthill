package com.supinfo.anthill.abstracts;

/**
 * @author Sebastien Magat
 * 
 */
public abstract class AbstractAnt {

	private int id, age;
	static int refId, nbOfDeath, nbOfBirth;

	public static int getNbOfDeath() {
		return nbOfDeath;
	}

	public static void setNbOfDeath(int nbOfDeath) {
		AbstractAnt.nbOfDeath = nbOfDeath;
	}

	public static int getNbOfBirth() {
		return nbOfBirth;
	}

	public static void setNbOfBirth(int nbOfBirth) {
		AbstractAnt.nbOfBirth = nbOfBirth;
	}

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

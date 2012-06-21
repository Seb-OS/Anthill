package com.supinfo.anthill.models.ant;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class MaleAnt extends AbstractAnt {

	private static int nbOfMales;

	public MaleAnt() {
		setId(getRefId() + 1);
		nbOfMales++;
		setNbOfBirth(getNbOfBirth() + 1);
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 20) {
			nbOfMales--;
			setNbOfDeath(getNbOfDeath() + 1);
		}
		return this;
	}

	public static int getNbOfMales() {
		return nbOfMales;
	}
	
}

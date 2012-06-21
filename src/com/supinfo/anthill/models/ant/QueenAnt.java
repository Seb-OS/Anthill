package com.supinfo.anthill.models.ant;

import com.supinfo.anthill.abstracts.AbstractAnt;
import com.supinfo.anthill.models.Anthill;

/**
 * @author Sebastien Magat
 * 
 */
public class QueenAnt extends AbstractAnt {

	private static int nbOfQueens;

	public QueenAnt() {
		setId(getRefId() + 1);
		nbOfQueens++;
		setNbOfBirth(getNbOfBirth() + 1);
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if ((getAge() < 50) && (MaleAnt.getNbOfMales() > 0)) {
			Anthill.randomBirth(10);
		} else if (getAge() >= 50) {
			nbOfQueens--;
			setNbOfDeath(getNbOfDeath() + 1);
		}
		return this;
	}

	public static int getNbOfQueens() {
		return nbOfQueens;
	}
}

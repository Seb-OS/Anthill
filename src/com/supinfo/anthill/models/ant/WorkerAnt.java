package com.supinfo.anthill.models.ant;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class WorkerAnt extends AbstractAnt {

	private static int nbOfWorkers;

	public WorkerAnt() {
		setId(getRefId() + 1);
		nbOfWorkers++;
		setNbOfBirth(getNbOfBirth() + 1);
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 50) {
			nbOfWorkers--;
			setNbOfDeath(getNbOfDeath() + 1);
		}
		return this;
	}

	public static int getNbOfWorkers() {
		return nbOfWorkers;
	}
}

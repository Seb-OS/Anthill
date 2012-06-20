package com.supinfo.anthill.ants;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class WorkerAnt extends AbstractAnt {

	static int nbOfWorkers;

	public WorkerAnt() {
		setId(getRefId() + 1);
		nbOfWorkers++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 50) {
			nbOfWorkers--;
		}
		return null;
	}
}

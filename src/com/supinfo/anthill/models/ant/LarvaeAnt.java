package com.supinfo.anthill.models.ant;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class LarvaeAnt extends AbstractAnt {

	private static int nbOfLarvaes;
	private AntsTypes type;

	public LarvaeAnt(AntsTypes type) {
		this.type = type;
		setId(getRefId() + 1);
		nbOfLarvaes++;
		setNbOfBirth(getNbOfBirth() + 1);
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		System.out.println("Larve a grandit");
		if (getAge() == 10) {
			nbOfLarvaes--;
			setNbOfDeath(getNbOfDeath() + 1);
			switch (type) {
			case QueenAnt:
				return new QueenAnt();
			case MaleAnt:
				return new MaleAnt();
			default:
				return new WorkerAnt();
			}
		}
		return this;
	}

	public static int getNbOfLarvaes() {
		return nbOfLarvaes;
	}

}

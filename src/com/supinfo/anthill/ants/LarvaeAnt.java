package com.supinfo.anthill.ants;

import java.util.Random;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class LarvaeAnt extends AbstractAnt {

	static int nbOfLarvaes;

	public LarvaeAnt() {
		setId(getRefId() + 1);
		nbOfLarvaes++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 10) {
			nbOfLarvaes--;
			Random random = new Random();
			switch (random.nextInt(3)) {
			case 0:
				return new MaleAnt();
			case 1:
				return new WorkerAnt();
			case 2:
				return new QueenAnt();
			default:
				return null;
			}
		}
		return null;
	}

}

package com.supinfo.anthill.models.ant;

import java.util.Random;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class QueenAnt extends AbstractAnt {

	private static int nbOfQueens;

	public QueenAnt() {
		setId(getRefId() + 1);
		nbOfQueens++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() < 50) {
			randomBirth();
		}

		else if (getAge() >= 50) {
			nbOfQueens--;
		}
		return null;
	}

	public static int getNbOfQueens() {
		return nbOfQueens;
	}

	private AbstractAnt randomBirth() {
		Random random = new Random();
		int x = random.nextInt(20);
		if (x == 0) {
			return new QueenAnt();
		} else if ((x == 1) || (x == 2)) {
			return new MaleAnt();
		} else {
			return new WorkerAnt();
		}
	}
}

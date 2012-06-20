package com.supinfo.anthill.ants;

import java.util.Random;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class LarvaeAnt extends AbstractAnt {

	private static int nbOfLarvaes;

	public LarvaeAnt() {
		setId(getRefId() + 1);
		nbOfLarvaes++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		System.out.println("Larve a grandit");
		if ((getAge() == 10) && (MaleAnt.getNbOfMales() > 0)
				&& (QueenAnt.getNbOfQueens() > 0)) {
			nbOfLarvaes--;
			Random random = new Random();
			switch (random.nextInt(20)) {
			case 0:
				System.out.println("Naissance d'un mâle");
				return new MaleAnt();
			case 1:
				System.out.println("naissance d'un communiste");
				return new WorkerAnt();
			default:
				System.out.println("Oh la belle reine");
				return new QueenAnt();
			}
		}
		return this;
	}

	public static int getNbOfLarvaes() {
		return nbOfLarvaes;
	}

}

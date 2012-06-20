package com.supinfo.anthill.ants;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class QueenAnt extends AbstractAnt {

	static int nbOfQueens;

	public QueenAnt() {
		setId(getRefId() + 1);
		nbOfQueens++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 50) {
			nbOfQueens--;
		}
		return null;
	}

}

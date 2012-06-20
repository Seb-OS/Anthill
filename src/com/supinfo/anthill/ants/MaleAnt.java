package com.supinfo.anthill.ants;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class MaleAnt extends AbstractAnt {

	static int nbOfMales;

	public MaleAnt() {
		setId(getRefId() + 1);
		nbOfMales++;
	}

	@Override
	public AbstractAnt updateStatus() {
		setAge(getAge() + 1);
		if (getAge() == 20) {
			nbOfMales--;
		}
		return null;
	}

}

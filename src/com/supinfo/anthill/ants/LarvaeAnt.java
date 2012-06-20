package com.supinfo.anthill.ants;

import com.supinfo.anthill.abstracts.AbstractAnt;

/**
 * @author Sebastien Magat
 * 
 */
public class LarvaeAnt extends AbstractAnt {

	static int nbOfLarvaes;
	
	public LarvaeAnt() {
		nbOfLarvaes++;
	}

	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		super.setAge(age);
	}

	@Override
	public void lifeStatus() {
		if(getAge()==10){
			
		}
		//super.lifeStatus();
	}
	

}

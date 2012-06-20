package com.supinfo.anthill;

import java.util.ArrayList;
import java.util.List;

import com.supinfo.anthill.abstracts.AbstractAnt;
import com.supinfo.anthill.models.ant.LarvaeAnt;
import com.supinfo.anthill.models.ant.MaleAnt;
import com.supinfo.anthill.models.ant.QueenAnt;
import com.supinfo.anthill.models.ant.WorkerAnt;

public class Anthill {

	// mettre array list de ants
	// cf animaux qui grossissent de maniere differente,
	// ou fridge.java
	private List<AbstractAnt> antHill;

	public Anthill() {
		antHill = new ArrayList<AbstractAnt>();
		for (int i = 0; i <= 10; i++) {
			antHill.add(new MaleAnt());
			antHill.add(new LarvaeAnt());
			antHill.add(new QueenAnt());
			antHill.add(new WorkerAnt());
			System.out.println("Ils sont ici !!!");
		}
	}

	public void nextTurn() {
		for (int i = 0; i < antHill.size(); i++) {
			antHill.set(i, antHill.get(i).updateStatus());
		}
	}
}

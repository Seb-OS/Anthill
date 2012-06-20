package com.supinfo.anthill;

import java.util.ArrayList;
import java.util.List;

import com.supinfo.anthill.abstracts.AbstractAnt;

public class Anthill {

	// mettre array list de ants
	// cf animaux qui grossissent de maniere differente,
	// ou fridge.java
	private List<AbstractAnt> antHill;

	public Anthill() {
		antHill = new ArrayList<AbstractAnt>();
		this.antHill = antHill;
	}

	public void nextTurn() {
		for (AbstractAnt ant : antHill) {
			ant.updateStatus();
		}
		// Faire boucle sur la collection avec un for each.
		// Met a jour chaque statu
	}
}

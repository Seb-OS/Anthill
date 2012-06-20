package com.supinfo.anthill.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.supinfo.anthill.abstracts.AbstractAnt;
import com.supinfo.anthill.models.ant.AntsTypes;
import com.supinfo.anthill.models.ant.LarvaeAnt;
import com.supinfo.anthill.models.ant.MaleAnt;
import com.supinfo.anthill.models.ant.QueenAnt;
import com.supinfo.anthill.models.ant.WorkerAnt;

public class Anthill {

	private List<AbstractAnt> antHill;
	private int age;

	public Anthill(int nbrOfL, int nbrOfW, int nbrOfM, int nbrOfQ) {

		antHill = new ArrayList<AbstractAnt>();
		setAge(0);

		// init larvaes
		randomBirth(nbrOfL);
		// init workers
		for (int i = 0; i <= nbrOfW; i++) {
			antHill.add(new WorkerAnt());
		}
		// init males
		for (int i = 0; i <= nbrOfM; i++) {
			antHill.add(new MaleAnt());
		}
		// init queens
		for (int i = 0; i <= nbrOfQ; i++) {
			antHill.add(new QueenAnt());
		}
	}

	public void nextTurn() {
		age++;
		display();
		for (int i = 0; i < antHill.size(); i++) {
			antHill.set(i, antHill.get(i).updateStatus());
		}// si update status == null sortir la fourmie du tableau...
	}

	// le return sort du for : dc methode a revoir...
	public static AbstractAnt randomBirth(int nb) {
		for (int i = 0; i <= nb; i++) {
			Random random = new Random();
			int x = random.nextInt(20);
			if (x == 0) {
				new LarvaeAnt(AntsTypes.QueenAnt);
			} else if ((x == 1) || (x == 2)) {
				new LarvaeAnt(AntsTypes.MaleAnt);
			} else {
				new LarvaeAnt(AntsTypes.WorkerAnt);
			}
		}
		return null;
	}

	public int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public void display() {
		System.out.println("Age of the anthill : " + this.age);
		System.out.println("Number of :");
		System.out.println("*** ants by type ***");
		System.out.println("- larvaes : " + LarvaeAnt.getNbOfLarvaes());
		System.out.println("- workers : " + WorkerAnt.getNbOfWorkers());
		System.out.println("- males : " + MaleAnt.getNbOfMales());
		System.out.println("- queens : " + QueenAnt.getNbOfQueens());
		System.out.println(" ");
		System.out.println("*** births ***");
		System.out.println(AbstractAnt.getNbOfBirth());
		System.out.println("*** deaths ***");
		System.out.println(AbstractAnt.getNbOfDeath());
	}
}

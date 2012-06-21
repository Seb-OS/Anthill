package com.supinfo.anthill.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.supinfo.anthill.abstracts.AbstractAnt;
import com.supinfo.anthill.models.ant.AntsTypes;
import com.supinfo.anthill.models.ant.LarvaeAnt;
import com.supinfo.anthill.models.ant.MaleAnt;
import com.supinfo.anthill.models.ant.QueenAnt;
import com.supinfo.anthill.models.ant.WorkerAnt;

public class Anthill implements Serializable {

	private static List<AbstractAnt> antHill;// modifié en static
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

	//A MODIFIER
	public void nextTurn() {
		age++;
		display();
		for (int i = 0; i < antHill.size(); i++) {
			AbstractAnt antTemp = antHill.get(i).updateStatus();
			if(antTemp == null){
				antHill.remove(i);
			}else{
				antHill.set(i, antTemp);
			}
		}
	}

	public static void randomBirth() {
		Random random = new Random();
		int x = random.nextInt(20);
		if (x == 0) {
			antHill.add(new LarvaeAnt(AntsTypes.QueenAnt));
		} else if ((x == 1) || (x == 2)) {
			antHill.add(new LarvaeAnt(AntsTypes.MaleAnt));
		} else {
			antHill.add(new LarvaeAnt(AntsTypes.WorkerAnt));
		}
	}

	public static void randomBirth(int nb) {
		for (int i = 0; i <= nb; i++) {
			randomBirth();
		}
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

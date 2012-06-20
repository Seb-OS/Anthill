package com.supinfo.anthill.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.supinfo.anthill.abstracts.AbstractAnt;
import com.supinfo.anthill.models.ant.AntsTypes;
import com.supinfo.anthill.models.ant.LarvaeAnt;
import com.supinfo.anthill.models.ant.MaleAnt;
import com.supinfo.anthill.models.ant.QueenAnt;
import com.supinfo.anthill.models.ant.WorkerAnt;

public class Anthill {

	private List<AbstractAnt> antHill;
	private int age, nbOfDeath;
	static int nbOfBirth;

	public Anthill() {
		antHill = new ArrayList<AbstractAnt>();
		setAge(0);
		int x = 0;
		System.out.println("Choose the number of ants...");
		// nb of larvaes
		System.out.println("How many larvaes do you want ?");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		randomBirth(x);
		// nb of workers
		System.out.println("How many workers do you want ?");
		x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			antHill.add(new WorkerAnt());
		}
		// nb of males
		System.out.println("How many males do you want ?");
		x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			antHill.add(new MaleAnt());
		}
		// nb of queens
		System.out.println("How many queens do you want ?");
		x = sc.nextInt();
		for (int i = 0; i <= x; i++) {
			antHill.add(new QueenAnt());
		}
	}

	public void nextTurn() {
		age++;
		display();
		for (int i = 0; i < antHill.size(); i++) {
			antHill.set(i, antHill.get(i).updateStatus());
		}
	}

	public static AbstractAnt randomBirth(int nb) {
		for (int i = 0; i <= nb; i++) {
			nbOfBirth++;
			Random random = new Random();
			int x = random.nextInt(20);
			if (x == 0) {
				return new LarvaeAnt(AntsTypes.QueenAnt);
			} else if ((x == 1) || (x == 2)) {
				return new LarvaeAnt(AntsTypes.MaleAnt);
			} else {
				return new LarvaeAnt(AntsTypes.WorkerAnt);
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
		System.out.println(nbOfBirth);
		System.out.println("*** deaths ***");
		System.out.println(nbOfDeath);
	}
}

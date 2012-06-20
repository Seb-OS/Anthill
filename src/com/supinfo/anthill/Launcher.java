/**
 * 
 */
package com.supinfo.anthill;

import java.util.Scanner;

import com.supinfo.anthill.models.Anthill;

/**
 * @author Sebastien Magat
 * 
 */
public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Choose the number of ants...");
		Scanner sc = new Scanner(System.in);

		// nb of larvaes
		System.out.println("How many larvaes do you want ?");
		int nbrOfL = sc.nextInt();
		// nb of workers
		System.out.println("How many workers do you want ?");
		int nbrOfW = sc.nextInt();
		// nb of males
		System.out.println("How many males do you want ?");
		int nbrOfM = sc.nextInt();
		// nb of queens
		System.out.println("How many queens do you want ?");
		int nbrOfQ = sc.nextInt();

		new Anthill(nbrOfL, nbrOfW, nbrOfM, nbrOfQ);

	}

}

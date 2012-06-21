/**
 * 
 */
package com.supinfo.anthill;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.FileOutputStream;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
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

		Anthill myAnthill = new Anthill(nbrOfL, nbrOfW, nbrOfM, nbrOfQ);

		do {
			System.out.println("What do you want ?");
			System.out.println("1 - jump one day");
			System.out.println("2 - jump of 'x' days");
			System.out.println("3 - save your anthill");
			int x = sc.nextInt();
			switch (x) {
			case 1:
				myAnthill.nextTurn();
				break;
			case 2:
				try {
					System.out.println("How many days do you want to jump ?");
					x = sc.nextInt();
					for (int i = 0; i <= x; i++) {
						myAnthill.nextTurn();
					}
				} catch (Exception e) {
					System.out.println("Bad value");
				}
			case 3:
				System.out.println("save");
				try {
					FileOutputStream antFile = new FileOutputStream("myAnthill.ser");
					ObjectOutputStream oos = new ObjectOutputStream(antFile);
					oos.writeObject(myAnthill);
					oos.flush();
					oos.close();
				} catch (Exception e) {
					System.out.println("Error : file not saved");
				}
				break;
			default:
				break;
			}
		} while (true);
	}
}

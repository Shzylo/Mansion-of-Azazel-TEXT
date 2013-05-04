package com.webs.shzylojava.mansionazazel;

import java.util.Scanner;

public class MansionAzazel {
  
	public static Scanner s = new Scanner(System.in);
	
	public static String name = ("> ");
	public static String user = (null);
	
	public static int scene = (0);
	public static int health = (20);
	
	public static int wolfHealth = (0);
	public static int wizardHealth = (100);
	
	public static boolean inspectCar = (true);
	public static boolean inspectBoat = (true);
	
	public static boolean frontDoorLocked = (true);
	public static boolean ghostExists = (true);
	public static boolean checkedBoltedDoor = (false);
	
	public static boolean enterCellar = (true);
	public static boolean wolfAlive = (true);
	public static boolean hasKnife = (false);
	
	public static boolean CellarEncryptLocked = (true); 
	
	public static boolean hasScrewDriver = (false);
	
// For delays for the person to read the text.
	
	public static void sleep() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
// For scrolling of text at the beginning, and death messages.
	
	public static void textSleep() {
		try {
			Thread.sleep(25);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void alive() {
		if(health > 0) {
			return;
		}
		if(health <= 0) {
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("\n||                                                                            "); textSleep();
			System.out.print("||"); textSleep();
			System.out.print("\n||                            "); textSleep();
			System.out.print("G"); textSleep();
			System.out.print("A"); textSleep();
			System.out.print("M"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("V"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print("R"); textSleep();
			System.out.print("!"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("Y"); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("U"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("D"); textSleep();
			System.out.print("I"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print("D"); textSleep();
			System.out.print("!                            "); textSleep();
			System.out.print("||"); textSleep();
			System.out.print("\n||                                                                            "); textSleep();
			System.out.print("||"); textSleep();
			System.out.print("\n="); textSleep(); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			System.out.print("="); textSleep();
			sleep();
			System.exit(0);
		}
	}
	
	public static void start() {
		System.out.println("\nPlease enter a username:");
		System.out.print(name);
		name = s.nextLine().replace(" ", "_") + ("> ");
		Scenes.start();
	}
	
	public static void main(String[] args) {
		System.out.print("M"); textSleep();
		System.out.print("a"); textSleep();
		System.out.print("n"); textSleep();
		System.out.print("s"); textSleep();
		System.out.print("i"); textSleep();
		System.out.print("o"); textSleep();
		System.out.print("n"); textSleep();
		System.out.print(" "); textSleep();
		System.out.print("o"); textSleep();
		System.out.print("f"); textSleep();
		System.out.print(" "); textSleep();
		System.out.print("A"); textSleep();
		System.out.print("z"); textSleep();
		System.out.print("a"); textSleep();
		System.out.print("z"); textSleep();
		System.out.print("e"); textSleep();
		System.out.print("l"); textSleep();
		System.out.print("\n"); textSleep();
		sleep();
		System.out.print("b"); textSleep();
		System.out.print("y"); textSleep();
		System.out.print(" "); textSleep();
		System.out.print("S"); textSleep();
		System.out.print("h"); textSleep();
		System.out.print("z"); textSleep();
		System.out.print("y"); textSleep();
		System.out.print("l"); textSleep();
		System.out.println("o");
		sleep();
		System.out.println("\nType START to start the game, or EXIT to exit.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			if(user.equalsIgnoreCase("start")) {	
				start();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease type START or EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 0);
	}
	
	public static void exit() {
		System.out.println("\nExiting Console..");
		sleep();
		System.exit(0);
	}
}

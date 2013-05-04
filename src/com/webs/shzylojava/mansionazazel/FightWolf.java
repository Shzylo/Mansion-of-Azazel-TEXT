package com.webs.shzylojava.mansionazazel;

import java.util.Random;

public class FightWolf extends Scenes {

  public static void begin() {
		System.out.println(CellarEncryptLocked);
		sleep();
		System.out.println("\nThere is a wolf there.");
		sleep();
		System.out.println("\nIt seems that you have awoken it..\n" +
				"And it is going to attack you!");
		sleep();
		
		if(hasKnife == true) {
			System.out.println("\nYou have the knife you picked up from earlier;\n" +
					"Use that to fight the wolf!");
			youFight();
		} else {
			System.out.println("\nYou don't have any protection but your fists;\n" +
					"Give it the best you got!");
			youFight();
		}
	}
	
	private static void youFight() {
		Random attackDamage = new Random();
		int ad = attackDamage.nextInt(3);
		
		if(hasKnife == true) {
			switch(ad) {
			case 0:
				wolfHealth -= 2;
				break;
			case 1:
				wolfHealth -= 3;
				break;
			case 2:
				wolfHealth -= 4;
				break;
			}
		} else {
			switch(ad) {
			case 0:
				wolfHealth -= 1;
				break;
			case 1:
				wolfHealth -= 2;
				break;
			case 2:
				wolfHealth -= 3;
				break;
			}
		}
		
		if(hasKnife == true) {
			sleep();
			System.out.println("\nPlease make a move: STAB, SLASH, THROW.");
			System.out.print(name);
			user = s.nextLine();
			
			if(user.equalsIgnoreCase("stab")) {
				System.out.println("\nYou stab the wolf.");
				deadWolf();
				sleep();
				System.out.println("The wolf's health is now " + wolfHealth);
				wolfAttack();
			} else if(user.equalsIgnoreCase("slash")) {
				System.out.println("\nYou slit the dog's side.");
				deadWolf();
				sleep();
				System.out.println("The wolf's health is now " + wolfHealth);
				wolfAttack();
			} else if(user.equalsIgnoreCase("throw")) {
				System.out.println("\nYou throw your knife at the dog;\n" +
						"You no longer have a knife!");
				hasKnife = false;
				deadWolf();
				sleep();
				System.out.println("The wolf's health is now " + wolfHealth);
				wolfAttack();
			} else {
				System.out.println("\nPlease make a move: STAB, SLASH, THROW.");
			}
		} else {
			sleep();
			System.out.println("\nPlease make a move: PUNCH, KICK.");
			System.out.print(name);
			user = s.nextLine();
			
			if(user.equalsIgnoreCase("punch")) {
				System.out.println("\nYou punch the wolf.");
				deadWolf();
				sleep();
				System.out.println("The wolf's health is now " + wolfHealth);
				wolfAttack();
			} else if(user.equalsIgnoreCase("kick")) {
				System.out.println("\nYou kick the wolf.");
				deadWolf();
				sleep();
				System.out.println("The wolf's health is now " + wolfHealth);
				wolfAttack();
			} else {
				System.out.println("\nPlease make a move: PUNCH, KICK.");
				System.out.print(name);
				user = s.nextLine();
			}
		}
	}
	
	private static void wolfAttack() {
		Random wolfAttackDamage = new Random();
		int wad = wolfAttackDamage.nextInt(3);
		
		switch(wad) {
		case 0:
			health -= 1;
			break;
		case 1:
			health -= 2;
			break;
		case 2:
			health -= 3;
			break;
		}
		
		Random wolfAttack = new Random();
		int r = wolfAttack.nextInt(3);
		
		switch(r) {
		
		case 0:
			alive();
			sleep();
			System.out.println("\nThe wolf tackles you.");
			System.out.println("Your health is now " + health);
			youFight();
			break;
			
		case 1:
			alive();
			sleep();
			System.out.println("\nThe wolf takes offense and bites you on the leg.");
			System.out.println("Your health is now " + health);
			youFight();
			break;
			
		case 2:
			alive();
			sleep();
			System.out.println("\nStrangely the wolf pees on you...");
			System.out.println("Your health is now " + health);
			youFight();
			break;
		}
	}
	
	private static void deadWolf() {
		if(wolfHealth > 0) {
			return;
		} else {
			wolfAlive = false;
			System.out.print("\n   +"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("\n /"); textSleep();
			System.out.print("/"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("\\"); textSleep();
			System.out.print("\\"); textSleep();
			System.out.print("\n|"); textSleep();
			System.out.print("|"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("["); textSleep();
			System.out.print("W"); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("L"); textSleep();
			System.out.print("F"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("I"); textSleep();
			System.out.print("S"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("D"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print("A"); textSleep();
			System.out.print("D"); textSleep();
			System.out.print("!"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("Y"); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("U"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("W"); textSleep();
			System.out.print("I"); textSleep();
			System.out.print("N"); textSleep();
			System.out.print("!"); textSleep();
			System.out.print("]"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("|"); textSleep();
			System.out.print("|"); textSleep();
			System.out.print("\n \\"); textSleep();
			System.out.print("\\"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("-"); textSleep();
			System.out.print("/"); textSleep();
			System.out.print("/"); textSleep();
			System.out.print("\n   +"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			System.out.print("+"); textSleep();
			sleep();
			message();
		}
	}
	
	private static void message() {
		System.out.println("\nThe wolf is dead.\n" +
				"Your health is left at " + health);
		sleep();
		BossBattle.checkBossBattle();
	}
}

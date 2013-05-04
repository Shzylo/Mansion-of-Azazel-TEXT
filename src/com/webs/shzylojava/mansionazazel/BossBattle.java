package com.webs.shzylojava.mansionazazel;

import java.util.Random;

public class BossBattle extends Scenes {

  private static boolean yourTurn = (false);
	
	public static void checkBossBattle() {
		if(CellarEncryptLocked == true) {
			System.out.println("\nYou travel to the end of the room to see what is there.\n" +
					"At the end you stumble into the door. You try to budge it, but it's locked.\n" +
					"The lock is encrypted so no ordinary key can get into it.");
			sleep();
			System.out.println("You hear noises behind it; You travel back upstairs.");
			Scenes.scene_5();
		} else {
			questionToStart();
		}
	}
	
	public static void questionToStart() {
		sleep();
		scene = 0;
		System.out.println("\nYou travel to the end of the room to see what is there.");
		sleep();
		System.out.println("You try to budge the door open, but it won't work. the door is locked.");
		sleep();
		System.out.println("\nRemembering the unique-looking key you got from earlier,\n" +
				"you insert it into the lock, it fits!");
		sleep();
		sleep();
		System.out.println("\nSlowly, and quietly, you turn the key in the turbine, and push\n" +
				"the door open.");
		sleep();
		sleep();
		System.out.println("\nNoises, you hear loud noises.");
		sleep();
		System.out.println("BOOM!! You hear. Shaking the area around you.");
		sleep();
		System.out.println("\nWill you continue to the end of the hall? Yes or No");
		System.out.print(name);
		user = s.nextLine();
		
		if(user.equalsIgnoreCase("yes")) {
			startBossBattle();
		} else if(user.equalsIgnoreCase("no")) {
			System.out.println("\nAs you started to travel back, another bang happened,\n" +
					"and the whole building imploded on itself, you have died..");
			sleep();
			sleep();
			System.exit(0);
		} else {
			System.out.println("Please enter YES or NO");
			System.out.print(name);
			user = s.nextLine();
		}
	}
	
	public static void startBossBattle() {
		health = 100;
		System.out.println("\nYou continue down the hall.");
		sleep();
		System.out.println("The potion that you got earlier starts to glow and bubble.");
		sleep();
		System.out.println("\nThe glass cracks, breaks, and splashes on you.");
		sleep();
		System.out.println("It acted as if a health kit.. you feel stronger..\n" +
				"Your health goes up, your health is now " + health);
		sleep();
		sleep();
		System.out.println("\nThe wizard spots and shoots his magic at you, you are able to\n" +
				"dodge it in time.");
		sleep();
		System.out.println("\nYou jumped to the side, and luckily you find a staff,\n" +
				"and it appears to be enchanted.");
		sleep();
		System.out.println("Use it for your defense!");
		youAttack();
	}
	
	public static void youAttack() {
		yourTurn = true;
		sleep();
		System.out.println("\nMOVES: Blast, Strike, Anonymous");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("blast")) {
				yourTurn = false;
				System.out.println("\nYou use the enchanted staff, shooting a blast at the\n" +
						"wizard.");
				wizardHealth -= 13;
				sleep();
				enemyAlive();
				System.out.println("The wizards' health is now " + wizardHealth);
				enemyAttack();
			} else if(user.equalsIgnoreCase("strike")) {
				yourTurn = false;
				System.out.println("\nYou are able to get to the wizard and you strike him.");
				sleep();
				wizardHealth -= 9;
				enemyAlive();
				System.out.println("The wizards' health is now " + wizardHealth);
				enemyAttack();
			} else if(user.equalsIgnoreCase("anonymous")) {
				yourTurn = false;
				Random youAttack = new Random();
				int ya = youAttack.nextInt(5);
				
				switch( ya ) {
				case 0:
					wizardHealth -= 8;
					break;
				case 1:
					wizardHealth -= 10;
					break;
				case 2:
					wizardHealth -= 19;
					break;
				}
				System.out.println("\nYou attack the wizard with an anonymous attack.");
				sleep();
				enemyAlive();
				System.out.println("The wizards' health is now " + wizardHealth);
				enemyAttack();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nMOVES: Blast, Strike, Anonymous\n" +
						"Type EXIT to exit the game.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(yourTurn == true);
	}
	
	public static void enemyAttack() {
		Random enemyAttack = new Random();
		int ea = enemyAttack.nextInt(3);
		sleep();
		
		switch( ea ) {
		case 0:
			System.out.println("\nThe wizard strikes you.");
			sleep();
			health -= 10;
			alive();
			System.out.println("Your health is now " + health);
			break;
		case 1:
			System.out.println("\nHe hurls a fireball at you, scorching you.");
			sleep();
			health -= 12;
			alive();
			System.out.println("Your health is now " + health);
			break;
		case 2: 
			System.out.println("\nHe hurls a gust of wind at you slamming you into the wall.");
			sleep();
			health -= 15;
			alive();
			System.out.println("Your health is now " + health);
			break;
		}
		sleep();
		yourTurn = true;
		youAttack();
	}
	
	public static void enemyAlive() {
		if(wizardHealth > 0) {
			return;
		} else {
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
			System.out.print("G"); textSleep();
			System.out.print("A"); textSleep();
			System.out.print("M"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("C"); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("M"); textSleep();
			System.out.print("P"); textSleep();
			System.out.print("L"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print("T"); textSleep();
			System.out.print("E"); textSleep();
			System.out.print("!"); textSleep();
			System.out.print("Y"); textSleep();
			System.out.print("O"); textSleep();
			System.out.print("U"); textSleep();
			System.out.print(" "); textSleep();
			System.out.print("W"); textSleep();
			System.out.print("I"); textSleep();
			System.out.print("N"); textSleep();
			System.out.print("!"); textSleep();
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
			credits();
		}
	}
	
	public static void credits() {
		System.out.print("\nC"); textSleep();
		System.out.print("R"); textSleep();
		System.out.print("E"); textSleep();
		System.out.print("A"); textSleep();
		System.out.print("T"); textSleep();
		System.out.print("O"); textSleep();
		System.out.print("R"); textSleep();
		System.out.print(":"); textSleep();
		System.out.print(" "); sleep();
		System.out.print("S"); textSleep();
		System.out.print("h"); textSleep();
		System.out.print("z"); textSleep();
		System.out.print("y"); textSleep();
		System.out.print("l"); textSleep();
		System.out.print("o"); textSleep();
		sleep(); System.out.print("\n"); textSleep();
		System.out.print("I"); textSleep();
		System.out.print("N"); textSleep();
		System.out.print("S"); textSleep();
		System.out.print("P"); textSleep();
		System.out.print("I"); textSleep();
		System.out.print("R"); textSleep();
		System.out.print("A"); textSleep();
		System.out.print("T"); textSleep();
		System.out.print("I"); textSleep();
		System.out.print("O"); textSleep();
		System.out.print("N"); textSleep();
		System.out.print("S"); textSleep();
		System.out.print(":"); textSleep();
		System.out.print("\n"); sleep();
		System.out.println("\tPaul Speed"); sleep();
		System.out.println("\tEcroso Games"); sleep();
		System.out.println("\tMythruna Community"); sleep();
		System.out.println("\tEveryone who has supported me!"); sleep();
		System.out.println("\nThank you all, hope you enjoyed!");
		sleep();
		System.exit(0);
	}
}

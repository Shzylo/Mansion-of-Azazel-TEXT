package com.webs.shzylojava.mansionazazel;

public class Scenes extends MansionAzazel {

  public static void start() {
		System.out.println("\nYou awake in a car, realizing that you have been in a wreck.");
		sleep();
		System.out.println("You have hit a tree, but why were you in the wreck?");
		sleep();
		System.out.println("\nYou travel to a mansion nearby, to take some shelter.");
		sleep();
		System.out.println("It seems no one is even home.");
		scene_1();
	}
	
//----------Scene_1----------
	
	private static void scene_1() {
		scene = 1;
		sleep();
		System.out.println("\nFORWARD: Travel towards the front door.\n" +
				"LEFT: Travel towards the deck.\n" +
				"RIGHT: There are some poison ivy patches over there.\n" +
				"BACK: Go inspect your car.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_1();
			} else if(user.equalsIgnoreCase("left")) {
				left_1();
			} else if(user.equalsIgnoreCase("right")) {
				right_1();
			} else if(user.equalsIgnoreCase("back")) {
				back_1();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 1);
	}
	
	private static void forward_1() {
		
		if(frontDoorLocked == true) {
			System.out.println("\nYou try to turn the knob, but the door is locked.");
			sleep();
			System.out.println("You return back to the front yard of the mansion.");
			scene_1();
		} else {
			System.out.println("You open the door and you enter.");
			scene_2();
		}
	}
	
	private static void left_1() {
		System.out.println("\nYou walk over to the deck.");
		scene_3();
	}

	private static void right_1() {
		health --;
		System.out.println("\nYou travel into a poison ivy patch.");
		sleep();
		System.out.println("Your health is now " + health + ".");
		scene_4();
	}

	private static void back_1() {
		if(inspectCar == true) {
			System.out.println("\nYou travel back to your car and beside it you pick up a note.\n");
			sleep();
			System.out.println("The note reads:\n" +
					"\"Welcome to the Mansion of Azazel, enjoy your time with your new friends.\"\n");
			sleep();
			sleep();
			System.out.println("You travel back to the front of the mansion.");
			scene_1();
		} else {
			System.out.println("\nYou have already inspected your car.");
			sleep();
			System.out.println("You travel back to the front of the mansion.\n");
			scene_1();
		}
	}
	
//----------Scene_2----------
	
	private static void scene_2() {
		scene = 2;
		sleep();
		System.out.println("\nFORWARD: Travel to the kitchen.\n" +
				"LEFT: The lighting is dim, but you see a closet door.\n" +
				"RIGHT: Over there is a television.\n" +
				"BACK: Travel back outside.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_2();
			} else if(user.equalsIgnoreCase("left")) {
				left_2();
			} else if(user.equalsIgnoreCase("right")) {
				right_2();
			} else if(user.equalsIgnoreCase("back")) {
				back_2();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 2);
	}
	
	private static void forward_2() {
		System.out.println("You travel into the kitchen.\n");
		scene_5();
	}
	
	private static void left_2() {
		if(ghostExists == true) {
			ghostExists = false;
			System.out.println("\nYou travel over to the closet, as you see something appear.\n" +
					"It's a ghost, and it starts to attack you! You run back in fright.");
			scene_2();	
		} else {
			System.out.println("\nYou attempt to travel over there again, and this time the\n" +
					"ghost does not appear.");
			sleep();
			System.out.println("You open up the closet door, and you see a staircase.\n" +
					"You wlak up the staircase.");
			scene_9();
		}
	}
	
	private static void right_2() {
		System.out.println("\nYou travel over to the television, it flickers on and off real quick.\n" +
				"You travel back in slight fright.");
		scene_2();
	}
	
	private static void back_2() {
		System.out.println("\nYou travel back outside.");
		scene_1();
	}
	
//----------Scene_3----------
	
	private static void scene_3() {
		scene = 3;
		sleep();
		System.out.println("\nFORWARD: Attempt to swim across the lake.\n" +
				"LEFT: There is nothing but road, no reason to travel there.\n" +
				"RIGHT: You see a boat, there may be something useful within it.\n" +
				"BACK: Travel back to the front of the mansion.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_3();
			} else if(user.equalsIgnoreCase("left")) {
				left_3();
			} else if(user.equalsIgnoreCase("right")) {
				right_3();
			} else if(user.equalsIgnoreCase("back")) {
				back_3();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 3);
	}
	
	private static void forward_3() {
		System.out.println("\nYou attempt to swim across the lake.");
		sleep();
		System.out.println("You see a shadow underneath you, it's a huge fish!\n" +
				"It engulps you.");
		health = 0;
		alive();
	}
	
	private static void left_3() {
		System.out.println("\nThere is nothing but road in that direction, nothing useful.");
		scene_3();
	}
	
	private static void right_3() {
		if(inspectBoat == true) {
			frontDoorLocked = false;
			inspectBoat = false;
			System.out.println("\nYou inspect the boat..");
			sleep();
			System.out.println("You find a key! I wonder where it goes to..");
			sleep();
			System.out.println("You travel back onto the deck.");
			scene_3();
		} else {
			System.out.println("\nYou have already inspected the boat, you travel back.");
			scene_3();
		}
	}
	
	private static void back_3() {
		System.out.println("\nYou travel back to the front of the mansion.");
		scene_1();
	}
	
//----------Scene_4----------
	
	private static void scene_4() {
		scene = 4;
		sleep();
		System.out.println("\nFORWARD: Travel deeper into the poison ivy.\n" +
				"LEFT: Nothing useful over there.\n" +
				"RIGHT: Nothing useful over there either.\n" +
				"BACK: Travel back to the front of the mansion.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_4();
			} else if(user.equalsIgnoreCase("left")) {
				left_4();
			} else if(user.equalsIgnoreCase("right")) {
				right_4();
			} else if(user.equalsIgnoreCase("back")) {
				back_4();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 4);
	}
	
	private static void forward_4() {
		System.out.println("\nYou travel into poison ivy, you are highly allergic and you pass.");
		health = 0;
		sleep();
		alive();
	}
	
	private static void left_4() {
		System.out.println("\nNothing seems to be useful over there.");
		scene_4();
	}
	
	private static void right_4() {
		System.out.println("\nNothing but road, no reason to go there.");
		scene_4();
	}
	
	private static void back_4() {
		System.out.println("\nYou travel back to the front of the mansion.");
		scene_1();
	}
	
//----------Scene_5----------
	
	protected static void scene_5() {
		scene = 5;
		sleep();
		System.out.println("\nFORWARD: Travel into the cellar.\n" +
				"LEFT: You see a knife and freshly-cut fruit.\n" +
				"RIGHT: Travel outside through the kitchen door.\n" +
				"BACK: Go back into the living room.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_5();
			} else if(user.equalsIgnoreCase("left")) {
				left_5();
			} else if(user.equalsIgnoreCase("right")) {
				right_5();
			} else if(user.equalsIgnoreCase("back")) {
				back_5();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 5);
	}
	
	private static void forward_5() {
		
		if(wolfAlive == true) {
			enterCellar = true;
			scene = 0;
			System.out.println("\nThere is a sign that reads:\n" +
					"\"WARNING: Untamed\"");
			sleep();
			System.out.println("\nWould you like to enter?");
			System.out.print(name);
			user = s.nextLine();
			
			do {
				if(user.equalsIgnoreCase("yes")) {
					FightWolf.begin();
				} else if(user.equalsIgnoreCase("no")) {
					System.out.println("\nYou return to the kitchen.");
					enterCellar = false;
					scene_5();
				} else {
					System.out.println("\nPlease enter YES or NO.");
					System.out.print(name);
					user = s.nextLine();
				}
			} while(enterCellar == true);
		} else {
			System.out.println("\nYou travel into the cellar.");
			sleep();
			scene_7();
		}
	}
	
	private static void left_5() {
		if(hasKnife == true) {
			System.out.println("\nThere is nothing useful over there anymore.");
			scene_5();
		} else {
			System.out.println("\nYou walk over to the counter.\n" +
					"You pick up the fruit, realizing you are starving you eat it.");
			health += (5);
			sleep();
			System.out.println("Your health is now " + health);
			sleep();
			System.out.println("\nYou pick up the knife and examine it.\n" +
					"You store the knife for later use");
			hasKnife = true;
			scene_5();
		}
	}
	
	private static void right_5() {
		System.out.println("\nYou go outside the kitchen door.");
		scene_6();
	}
	
	private static void back_5() {
		System.out.println("\nYou go back into the living room.");
		scene_2();
	}
	
//----------Scene_6----------
	
	private static void scene_6() {
		scene = 6;
		sleep();
		System.out.println("\nFORWARD: Travel into the forest a bit, into a bush.\n" +
				"LEFT: You see a shed around there.\n" +
				"RIGHT: Nothing useful over there.\n" +
				"BACK: Go back into the kitchen.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_6();
			} else if(user.equalsIgnoreCase("left")) {
				left_6();
			} else if(user.equalsIgnoreCase("right")) {
				right_6();
			} else if(user.equalsIgnoreCase("back")) {
				back_6();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 6);
	}
	
	
	private static void forward_6() {
		System.out.println("\nYou go into a bush, and you find a screw driver.\n" +
				"Maybe you could find a use for it?");
		hasScrewDriver = true;
		scene_8();
	}
	
	
	private static void left_6() {
		System.out.println("\nYou travel over to a shed that is locked, but you may be able\n" +
				"to unscrew some bolts to open the door.");
		sleep();
		if(hasScrewDriver == true) {
			System.out.println("\nYou go ahead and start to unscrew the bolts, after a bit,\n" +
					"your hands are sore and the door falls. Within you see nothing.");
			scene_6();
		} else {
			System.out.println("\nYou don't have a way to unscrew the bolts, so you travel back.");
			scene_6();
		}
	}
	
	
	private static void right_6() {
		System.out.println("\nThere is nothing of use in that direction.");
		scene_6();
	}

	
	private static void back_6() {
		System.out.println("\nYou travel back into the kitchen.");
		scene_5();
	}
	
//----------Scene_7----------
	
	private static void scene_7() {
		scene = 7;
		sleep();
		System.out.println("\nFORWARD: Go into the encrypt-locked door.\n" +
				"LEFT: Nothing useful over there.\n" +
				"RIGHT: Nothing useful over there.\n" +
				"BACK: Go back to the kitchen.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_7();
			} else if(user.equalsIgnoreCase("left")) {
				left_7();
			} else if(user.equalsIgnoreCase("right")) {
				right_7();
			} else if(user.equalsIgnoreCase("back")) {
				back_7();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 7);
	}
	
	
	private static void forward_7() {
		BossBattle.checkBossBattle();
	}
	

	private static void left_7() {
		System.out.println("\nThere is nothing useful over there.");
		scene_7();
	}
	
	
	private static void right_7() {
		System.out.println("\nThere is nothing useful over there.");
		scene_7();
	}

	private static void back_7() {
		System.out.println("Back into the kitchen you travel.");
		scene_5();
	}
	
//----------Scene_8----------
	
	private static void scene_8() {
		scene = 8;
		sleep();
		System.out.println("\nFORWARD: An animal is back there, best not to disturb it.\n" +
				"LEFT: Nothing useful to travel over there for.\n" +
				"RIGHT: Poison ivy patch, best not go there.\n" +
				"BACK: Travel back to the patio of the kitchen.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_8();
			} else if(user.equalsIgnoreCase("left")) {
				left_8();
			} else if(user.equalsIgnoreCase("right")) {
				right_8();
			} else if(user.equalsIgnoreCase("back")) {
				back_8();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 8);
	}
	
	private static void forward_8() {
		System.out.println("\nYou travel into the bushes to see a small racoon fumbling in the bushes.");
		sleep();
		System.out.println("It scampers off in fright.");
		scene_8();
	}
	
	private static void left_8() {
		System.out.println("\nThere is nothing useful in that direction.");
		scene_8();
	}
	
	private static void right_8() {
		System.out.println("\nYou travel into poison ivy, you are highly allergic and you pass\n" +
				"on to the next life.");
		health = 0;
		sleep();
		alive();
	}
	
	private static void back_8() {
		System.out.println("\nYou go back to the patio of the kitchen.");
		scene_6();
	}
	
//----------Scene_9----------
	
	
	private static void scene_9() {
		scene = 9;
		sleep();
		System.out.println("\nFORWARD: Travel down the hallway.\n" +
				"LEFT: Nowhere to travel in that direction.\n" +
				"RIGHT: Nowhere to travel in that direction.\n" +
				"BACK: Go back downstairs.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_9();
			} else if(user.equalsIgnoreCase("left")) {
				left_9();
			} else if(user.equalsIgnoreCase("right")) {
				right_9();
			} else if(user.equalsIgnoreCase("back")) {
				back_9();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 9);
	}
		
		
	private static void forward_9() {
		System.out.println("\nYou travel down the hallway.");
		scene_10();
	}

	private static void left_9() {
		System.out.println("\nThere is nothing but wall.");
		scene_9();
	}
		
	private static void right_9() {
		System.out.println("\nThere is nothing but wall.");
		scene_9();
	}

	private static void back_9() {
		System.out.println("\nWalking back down the stairs.. you are back in the living room.");
		scene_2();
	}
	
//----------Scene_10----------	
	
	private static void scene_10() {
		scene = 10;
		sleep();
		System.out.println("\nFORWARD: Nothing but wall in that direction.\n" +
				"LEFT: Nothing but wall in that direction.\n" +
				"RIGHT: A door.\n" +
				"BACK: Walk back down the hallway.");
		System.out.print(name);
		user = s.nextLine();
		
		do {
			
			if(user.equalsIgnoreCase("forward")) {
				forward_10();
			} else if(user.equalsIgnoreCase("left")) {
				left_10();
			} else if(user.equalsIgnoreCase("right")) {
				right_10();
			} else if(user.equalsIgnoreCase("back")) {
				back_10();
			} else if(user.equalsIgnoreCase("exit")) {
				exit();
			} else {
				System.out.println("\nPlease enter FORWARD, LEFT, RIGHT, or BACK\n" +
						"If you would like to exit the game, type EXIT.");
				System.out.print(name);
				user = s.nextLine();
			}
		} while(scene == 10);
	}
			
			
	private static void forward_10() {
		System.out.println("\nThere is nothing but wall.");
		scene_10();
	}

	private static void left_10() {
		System.out.println("\nThere is nothing but wall.");
		scene_10();
	}
			
	private static void right_10() {
		if(checkedBoltedDoor == true) {
			System.out.println("\nThere is nothing else to claim from here.");
			scene_10();
		} else {
			checkedBoltedDoor = true;
			System.out.println("A door bolted shut, as if you could use a screwdriver to unscrew the door.");
			
			if(hasScrewDriver == true) {
				CellarEncryptLocked = false;
				System.out.println("You start to unscrew the bolts, after 2 out of 5 bolts, the door falls\n" +
						"from how rotted it was");
				sleep();
				System.out.println("Inside, you find a unique-looking key, and you find a nice potion.");
				scene_10();
			} else {
				System.out.println("You don't have a screwdriver, so you just travel back.");
				scene_10();
			}
		}
	}

	private static void back_10() {
		System.out.println("\nBack to the staircase you walk to.");
		sleep();
		scene_9();
	}
}

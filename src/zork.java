import java.util.Scanner;
public class zork {
	static int mana = 100;
	static int hp = 1;
	static int gp = 50;
	static int str = 10;
	static int dex = 10;
	static int intt = 10;
	static int wis = 10;
	static int con = 10;
	static int cer = 10;
	static int ac = 10;
	static int type=1;
	static int com=0;
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		Scanner np = new Scanner(System.in);
		System.out.println(
				"wellcom to mesfel the virtual console rpg \n here you can quest through the world of mesfel all in your \n high dpi console. ");
		System.out.println("______________________________________________________________________");
		System.out.println("now to get things started what is your race \n (elf,dwarf, or human)");
		
		String ans1 = kb.next();
		
		if (ans1.equalsIgnoreCase("elf")) {
			System.out.println("great choice elves are a magical people of otherworldly grace, \n living in the world but not entirely part of it. ");
		}
		if (ans1.equalsIgnoreCase("dwarf")) {
			System.out.println("great choice dwarves are solid and enduring like the mountains they love,\n weathering the passage of centuries with stoic endurance and little change. ");
		}
		if (ans1.equalsIgnoreCase("human")) {
			System.out.println("great choice whatever drives them, humans are the innovators, the achievers, and the pioneers of the worlds.");
		}
		System.out.println("______________________________________________________________________");
		System.out.println("Now what class do you want \n (Fighter, Wizard, Rogue)");
		String ans2 = kb.next();
		if (ans2.equalsIgnoreCase("Fighter")) {
			System.out.println(" another great choice rogues rely on skill, stealth, and their foes vulnerabilities to get the upper hand in any situation. They have a knack for finding the solution to just about any problem, bringing resourcefulness and versatility to their adventuring parties.");
		}
		if (ans2.equalsIgnoreCase("Wizard")) {
			System.out.println(" another great choice Drawing on the subtle weave of magic that permeates the \n cosmos, wizards cast spells of explosive fire, arcing lightning, subtle \n deception, and brute-force mind control.");
		}
		if (ans2.equalsIgnoreCase("Fighter")) {
			System.out.println(" another great choice questing knights, conquering overlords, royal champions,\n elite foot soldiers, hardened mercenaries, and bandit kings�as fighters,\n they all share an unparalleled mastery with weapons and armor, and a \n thorough knowledge of the skills of combat.");
		}
		System.out.println("______________________________________________________________________");
		if (ans2.equalsIgnoreCase("Wizard")) {
			System.out.println(
					"finaly what element do you chose \n to sepecise in. \n (1).fire, \n (2).water/ice  \n (3).earth \n (4).air (5).mental");
		}
		if (ans2.equalsIgnoreCase("Fighter")) {
			System.out.println(
					"finaly what weapon do you choose \n type in the corisponding number \n (1).longbow, \n (2).GreatSword  \n (3).Great Axe \n (4).silvan spear");
		}
		if (ans2.equalsIgnoreCase("Rogue")) {
			System.out.println(
					"finaly what weapon do you choose \n type in the corisponding number \n (1).dagger x2, \n (2).shortswords x2  \n (3).hand crossbow x2 \n (4).pencil ");
		}
		String ans3 = kb.next();
		System.out.println("______________________________________________________________________");
		// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		if (ans2.equalsIgnoreCase("Wizard") && ans3.equalsIgnoreCase("1")) {
			System.out.println("Fire chosen");
		}
		if (ans2.equalsIgnoreCase("Wizard") && ans3.equalsIgnoreCase("2")) {
			System.out.println("water/ice chosen");
		}
		if (ans2.equalsIgnoreCase("Wizard") && ans3.equalsIgnoreCase("3")) {
			System.out.println("Earth chosen");
		}
		if (ans2.equalsIgnoreCase("Wizard") && ans3.equalsIgnoreCase("4")) {
			System.out.println("Air chosen");
		}
		if (ans2.equalsIgnoreCase("Wizard") && ans3.equalsIgnoreCase("5")) {
			System.out.println("Mental chosen");
		}
		// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		if (ans2.equalsIgnoreCase("Rogue") && ans3.equalsIgnoreCase("1")) {
			System.out.println("a great choice for sneeky sneeky players");
		}
		if (ans2.equalsIgnoreCase("Rogue") && ans3.equalsIgnoreCase("2")) {
			System.out.println("a great choice for the fighter that is in all rogues");
		}
		if (ans2.equalsIgnoreCase("Rogue") && ans3.equalsIgnoreCase("3")) {
			System.out.println("two crossbows are a great choice for a more ranged players");
		}
		if (ans2.equalsIgnoreCase("Rogue") && ans3.equalsIgnoreCase("4")) {
			System.out.println("A pencil?! why not.");
		}
		// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		if (ans2.equalsIgnoreCase("fighter") && ans3.equalsIgnoreCase("1")) {
			System.out.println("A longbow is a great choice for a more ranged players");
		}
		if (ans2.equalsIgnoreCase("fighter") && ans3.equalsIgnoreCase("2")) {
			System.out.println("a great choice for a standed hack and slash player");
		}
		if (ans2.equalsIgnoreCase("fighter") && ans3.equalsIgnoreCase("3")) {
			System.out.println("a great choice for a barbarian type or just a buff mower");
		}
		if (ans2.equalsIgnoreCase("fighter") && ans3.equalsIgnoreCase("4")) {
			System.out.println("a great choce for the player who likes to get into it while staying out ");
		}
		// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		System.out.println("______________________________________________________________________");
		System.out.println("so with out further ado let us start");
		System.out.println("______________________________________________________________________");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("You are in an town ally closed on three sides and open to the steet ahead \n infront of you there is a goblin with a shortsword he is wereing a make shift studed lether armor with an ac of 13 \n would you like to engage in combat or attempt run \n (comms: run/run)");
		String ans4 = kb.next();
		
		// XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX//
		if (ans4.equalsIgnoreCase("run")) {
			System.out.println("You scan the ally looking for an escape route you find two \n you and climb up a dranage pipe \n or you can try to open a door on the side (it could be locked \n comms(door,pipe)");
		}
		String ans4r = kb.next();
		if (ans4.equalsIgnoreCase("run") && ans4r.equalsIgnoreCase("pipe")) {
			System.out.println("You climb the pipe onto the roof the pipe wobbles ad creakes but holds up \n you are now on the roof do you want to go to the market ,the inn, or the sherif \n comms(market,inn,sherif)");
			String ans4door = kb.next();
		}
		if (ans4.equalsIgnoreCase("run") && ans4r.equalsIgnoreCase("door")) {
			System.out.println("The door is locked \n do you want to try to pick the lock or try the pipe \ncomms(pipe,pick)");
			String ans4door = kb.next();
			if(ans4door.equalsIgnoreCase("pipe")){
				System.out.println("You climb the pipe onto the roof the pipe wobbles ad creakes but holds up \n you are now on the roof /n tutoral completed");
				 com=1;
			}
			if(ans4door.equalsIgnoreCase("pick") && ans2.equalsIgnoreCase("fighter") || ans2.equalsIgnoreCase("wizard")){
				System.out.println("You fail to pick the lock \n you die\n �������������������������������������");
				
			}
			if(ans4door.equalsIgnoreCase("pick") && ans2.equalsIgnoreCase("Rogue")){
				System.out.println("you pick the lock and you are in");
					System.out.println("tutoral compleated");
					com=1;
			}
			
			}
		if(com==1){
			System.out.println("______________________________________________________________________");
			System.out.println("Now chose your pokéman® ");
			System.out.println("______________________________________________________________________");
			System.out.println("bulbasur");
			System.out.println("squirtle");
			System.out.println("pikachu");
			System.out.println("charmander");
			String ans5 = kb.next();
			System.out.println("");
			System.out.println("");
			System.out.println("A wild magicarp appeared");
			
			
		}
		}
		}
	

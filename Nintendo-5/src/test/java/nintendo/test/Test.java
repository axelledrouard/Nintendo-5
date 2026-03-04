package nintendo.test;

import nintendo.model.Console;
import nintendo.model.Jeu;

public class Test {

	public static void main(String[] args) {

		Console c1 = new Console("PS4");
		Console c2 = new Console("PS5");
		Console c3 = new Console("Xbox One");
		
		Jeu jeu1 = new Jeu("Mario kart",c1);
		Jeu jeu2 = new Jeu("Stardew Valley",c2);
		Jeu jeu3 = new Jeu("Assassin's Creed",c2);
		Jeu jeu4 = new Jeu("Batman",c3);
		Jeu jeu5 = new Jeu("Sonic",c3);
		
	}

}

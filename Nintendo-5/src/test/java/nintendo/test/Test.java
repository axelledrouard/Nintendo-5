package nintendo.test;

import nintendo.model.Boutique;
import nintendo.model.Client;
import nintendo.model.Console;
import nintendo.model.Hybride;
import nintendo.model.Jeu;
import nintendo.model.Portable;
import nintendo.model.Salon;

public class Test {

	public static void main(String[] args) {

		Console c1 = new Salon("PS4");
		Console c2 = new Hybride("Switch");
		Console c3 = new Portable("Gameboy");
		
		Boutique boutique1 = new Boutique("Minecraft", "128 rue du dauphiné");
		
		Jeu jeu1 = new Jeu("Mario kart",c1, boutique1);
		Jeu jeu2 = new Jeu("Stardew Valley",c2, boutique1);
		Jeu jeu3 = new Jeu("Assassin's Creed",c2, boutique1);
		Jeu jeu4 = new Jeu("Batman",c3, boutique1);
		Jeu jeu5 = new Jeu("Sonic",c3, boutique1);
		
		Client client1 = new Client("Doe", "John");
		Client client2 = new Client("Doe", "Jane");
	
	}

}

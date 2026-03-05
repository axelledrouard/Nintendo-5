package nintendo.model;

import java.time.LocalDate;

public class Portable extends Console{

	public Portable(String nom, double prix, LocalDate dateSortie) {
		super(nom, prix, dateSortie);
	}

	public String toString() {
		return "Portable [prix=" + getPrix() + ", dateSortie=" + getDateSortie() + ", nom()=" + getNom()
				+ "]";
	}
	
	

}

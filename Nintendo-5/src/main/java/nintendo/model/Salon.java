package nintendo.model;

import java.time.LocalDate;

public class Salon extends Console{

	public Salon(String nom, double prix, LocalDate dateSortie) {
		super(nom,  prix, dateSortie);
	}

	public String toString() {
		return "Salon [prix=" + getPrix() + ", dateSortie=" + getDateSortie() + ", nom()=" + getNom()
				+ "]";
	}
}

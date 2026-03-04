package nintendo.model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nom;
    private String prenom;
    private List<Achat>achat=new ArrayList();

    public Client(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }

}

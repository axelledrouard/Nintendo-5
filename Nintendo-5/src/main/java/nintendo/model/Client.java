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
    
    

    public List<Achat> getAchat() {
		return achat;
	}

	public void setAchat(List<Achat> achat) {
		this.achat = achat;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", achat=" + achat + "]";
	}

	

}

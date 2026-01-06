package metier.entities;

import java.io.Serializable;

public class produits implements Serializable {
	
	private long id;
	private String designation;
	private Double prix;
	private int quantite;
	
	public produits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public produits(long id, String designation, Double prix, int quantite) {
		super();
		this.id = id;
		this.designation = designation;
		this.prix = prix;
		this.quantite = quantite;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
	

}

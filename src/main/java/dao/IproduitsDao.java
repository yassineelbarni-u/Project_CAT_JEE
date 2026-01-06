package dao;

import java.util.List;

import metier.entities.produits;

public interface IproduitsDao  {
	
	public produits save(produits p);
	
	public List<produits> produitParMc(String mc);
	
	public produits getProduits(Long id);
	
	public produits update(produits p);
	
	public void deleteProduit(long id); 

}

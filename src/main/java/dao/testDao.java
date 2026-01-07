package dao;

import metier.entities.produits;

public class testDao {

	public static void main(String[] args) {
		
		produitDaoImple dao=new produitDaoImple();
		
		produits p1 = dao.save(new produits("HP",123,23));
		produits p2 = dao.save(new produits("HP2",200,12));

	}

}

package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import metier.entities.produits;

public class produitDaoImple implements IproduitsDao {

	@Override
	public produits save(produits p) {
		Connection connection=singletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO produits(DESIGNATION , PRIX , QUANTITE) VALUES(?,?,?)");
			ps.setString(1, p.getDesignation());
			if (p.getPrix() == null) {
				  ps.setNull(2, java.sql.Types.DOUBLE);
				} else {
				  ps.setDouble(2, p.getPrix());
				}
			ps.setInt(3, p.getQuantite());
			ps.executeUpdate();
			PreparedStatement ps2 = connection.prepareStatement("SELECT MAX(ID) AS MAXID FROM produits");
			ResultSet rs = ps2.executeQuery();
			if(rs.next()) {
				p.setId(rs.getLong("MAXID"));
			}
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<produits> produitParMc(String mc) {
		List<produits> produit = new ArrayList<produits>();
		Connection connection = singletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT *FROM produits where designation LIKE ?");
			
			ps.setString(1, mc);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				produits p = new produits();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}

	@Override
	public produits getProduits(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public produits update(produits p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduit(long id) {
		// TODO Auto-generated method stub
		
	}

}

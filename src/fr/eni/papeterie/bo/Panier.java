package fr.eni.papeterie.bo;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	private float montant;
	private List<Ligne> lignesPanier;
	
	public Panier() {
		lignesPanier = new ArrayList<Ligne>();
	}
	
	public final List<Ligne> getLignePanier() {
		return lignesPanier;
	}
	
	public void addLigne(Article article, int qte) {
		Ligne ligneAdding = new Ligne(article, qte);
		lignesPanier.add(ligneAdding);
	}


	public final Ligne getLigne(int index) {
		return lignesPanier.get(index);
	}
	
	
	public void removeLigne(int index) {
		lignesPanier.remove(index);
	}
	
	
	public void upDateLigne(int index, int newQte) {
		this.getLigne(index).setQte(newQte);
	}
	
	
	public float getMontant() {
		return montant;
	}
	
	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append("Panier: \n\n");
		for (Ligne ligne : lignesPanier) {
			if (ligne != null) {
				buffer.append("ligne " + lignesPanier.indexOf(ligne) + ":\t");
				buffer.append(ligne.toString());
				buffer.append("\n");
			} else break;
		}
		buffer.append("\nValeur du panier: " + getMontant());
		buffer.append("\n\n");
		
		return buffer.toString();
	}
	
}
















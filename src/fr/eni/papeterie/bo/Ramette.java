package fr.eni.papeterie.bo;

public class Ramette extends Article {
	
	private int grammage;

	public Ramette(int idArticle, String reference, String marque, String designation, float prixUnitaire,
			int qteStock) {
		super(idArticle, reference, marque, designation, prixUnitaire, qteStock);
		// TODO Auto-generated constructor stub
	}
	
	public Ramette(int idArticle, String reference, String marque, String designation, float prixUnitaire,
			int qteStock, int grammage) {
		super(idArticle, reference, marque, designation, prixUnitaire, qteStock);
		this.grammage = grammage;
	}
	
	public Ramette(String reference, String marque, String designation, float prixUnitaire,
			int qteStock, int grammage) {
		super(reference, marque, designation, prixUnitaire, qteStock);
		this.grammage = grammage;
	}

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(super.toString());
		buffer.append(" ");
		buffer.append("Ramette [ grammage: ");
		buffer.append(getGrammage());
		buffer.append(" ]");
		return buffer.toString();
	}
	
	

}

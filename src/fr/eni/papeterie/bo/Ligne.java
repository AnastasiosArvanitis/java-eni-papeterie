package fr.eni.papeterie.bo;

public class Ligne {
	
	private int quantite;
	private Article article;
	
	public Ligne(int quantite, Article article) {
		this.quantite = quantite;
		this.article = article;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
	
	public float getPrix() {
		return this.article.getPrixUnitaire();
	}

	@Override
	public String toString() {
		return "Ligne [quantite=" + quantite + ", article=" + article + ", getQuantite()=" + getQuantite()
				+ ", getArticle()=" + getArticle() + ", getPrix()=" + getPrix() + "]";
	}
	
	
	
}

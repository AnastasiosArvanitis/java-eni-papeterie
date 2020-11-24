package fr.eni.papeterie.bo;

public class Ligne {
	
	protected int qte;
	protected Article article;
	
	public Ligne(Article article, int qte) {
		this.qte = qte;
		this.article = article;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
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
		StringBuffer buffer = new StringBuffer();
		buffer.append("Ligne ");
		buffer.append(" quantite: ");
		buffer.append(getQte());
		buffer.append(", prix: ");
		buffer.append(getPrix());
		buffer.append(", ");
		if (article != null) {
			buffer.append("article: ");
			buffer.append(getArticle().toString());
		}
		
		buffer.append(" ]");
		return buffer.toString();
	}
	
	
	
}

package balance.entity;

public class Coefficient {

	//private Integer idCoefficient;

	// always contain 8 digits
	private String article;

	// title article
	private String titleArticle;

	// coefficient (Length * width)
	private double coef;

	/*public Integer getIdCoefficient() {
		return idCoefficient;
	}

	public void setIdCoefficient(Integer idCoefficient) {
		this.idCoefficient = idCoefficient;
	}**/

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public String getTitleArticle() {
		return titleArticle;
	}

	public void setTitleArticle(String titleArticle) {
		this.titleArticle = titleArticle;
	}

}

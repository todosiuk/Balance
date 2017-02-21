package balance.entity;

public class QBalancesSquareMeters {

	private String article;
	private String titleArticle;
	private Double squareMeters;
	
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
	public Double getSquareMeters() {
		return squareMeters;
	}
	public void setSquareMeters(Double squareMeters) {
		this.squareMeters = squareMeters;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((squareMeters == null) ? 0 : squareMeters.hashCode());
		result = prime * result + ((titleArticle == null) ? 0 : titleArticle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		QBalancesSquareMeters other = (QBalancesSquareMeters) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (squareMeters == null) {
			if (other.squareMeters != null)
				return false;
		} else if (!squareMeters.equals(other.squareMeters))
			return false;
		if (titleArticle == null) {
			if (other.titleArticle != null)
				return false;
		} else if (!titleArticle.equals(other.titleArticle))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "QBalancesSquareMeters [article=" + article + ", titleArticle=" + titleArticle + ", squareMeters="
				+ squareMeters + "]";
	}
}

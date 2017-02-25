package balance.entity;

public class Balance {

	private String article;
	private String titleArticle;
	private Double squareMetersQ;
	private Double squareMetersP;
	private Double differenceQP;

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

	public Double getSquareMetersQ() {
		return squareMetersQ;
	}

	public void setSquareMetersQ(Double squareMetersQ) {
		this.squareMetersQ = squareMetersQ;
	}

	public Double getSquareMetersP() {
		return squareMetersP;
	}

	public void setSquareMetersP(Double squareMetersP) {
		this.squareMetersP = squareMetersP;
	}

	public Double getDifferenceQP() {
		return differenceQP;
	}

	public void setDifferenceQP(Double differenceQP) {
		this.differenceQP = differenceQP;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((differenceQP == null) ? 0 : differenceQP.hashCode());
		result = prime * result + ((squareMetersP == null) ? 0 : squareMetersP.hashCode());
		result = prime * result + ((squareMetersQ == null) ? 0 : squareMetersQ.hashCode());
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
		Balance other = (Balance) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (differenceQP == null) {
			if (other.differenceQP != null)
				return false;
		} else if (!differenceQP.equals(other.differenceQP))
			return false;
		if (squareMetersP == null) {
			if (other.squareMetersP != null)
				return false;
		} else if (!squareMetersP.equals(other.squareMetersP))
			return false;
		if (squareMetersQ == null) {
			if (other.squareMetersQ != null)
				return false;
		} else if (!squareMetersQ.equals(other.squareMetersQ))
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
		return "Balance [article=" + article + ", titleArticle=" + titleArticle + ", squareMetersQ=" + squareMetersQ
				+ ", squareMetersP=" + squareMetersP + ", differenceQP=" + differenceQP + "]";
	}

}

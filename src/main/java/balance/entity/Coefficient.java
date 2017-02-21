package balance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "coefficient")
public class Coefficient implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idCoefficient;

	// always contain 8 digits
	@Column(name = "article")
	private String article;

	// title article
	@Column(name = "title")
	private String titleArticle;

	// coefficient (Length * width)
	@Column(name = "coef")
	private Double coef;

	public Integer getIdCoefficient() {
		return idCoefficient;
	}

	public void setIdCoefficient(Integer d) {
		this.idCoefficient = d;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((article == null) ? 0 : article.hashCode());
		result = prime * result + ((coef == null) ? 0 : coef.hashCode());
		result = prime * result + ((idCoefficient == null) ? 0 : idCoefficient.hashCode());
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
		Coefficient other = (Coefficient) obj;
		if (article == null) {
			if (other.article != null)
				return false;
		} else if (!article.equals(other.article))
			return false;
		if (coef == null) {
			if (other.coef != null)
				return false;
		} else if (!coef.equals(other.coef))
			return false;
		if (idCoefficient == null) {
			if (other.idCoefficient != null)
				return false;
		} else if (!idCoefficient.equals(other.idCoefficient))
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
		return "Coefficient [idCoefficient=" + idCoefficient + ", article=" + article + ", titleArticle=" + titleArticle
				+ ", coef=" + coef + "]";
	}

}

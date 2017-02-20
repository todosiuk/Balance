package balance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="coefficient")
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

}

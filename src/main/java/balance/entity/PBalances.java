package balance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//this class contains data Potamus
@Entity
@Table(name = "PBalances")
public class PBalances implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idPBalance;

	// always contain 8 digits
	@Column(name = "article")
	private String pArticle;

	// article title
	@Column(name = "title")
	private String pTitleArticle;

	// quantity measured in square meters or pieces
	@Column(name = "quantity")
	private double pQuantity;

	public Integer getIdPBalance() {
		return idPBalance;
	}

	public void setIdPBalance(Integer idPBalance) {
		this.idPBalance = idPBalance;
	}

	public double getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(double pQuantity) {
		this.pQuantity = pQuantity;
	}

	public String getpArticle() {
		return pArticle;
	}

	public void setpArticle(String pArticle) {
		this.pArticle = pArticle;
	}

	public String getpTitleArticle() {
		return pTitleArticle;
	}

	public void setpTitleArticle(String pTitleArticle) {
		this.pTitleArticle = pTitleArticle;
	}

}

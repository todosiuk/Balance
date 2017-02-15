package balance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//this class contains data Potamus
@Entity(name = "PBalances")
public class PBalances {

	// private Integer idPBalance;

	// always contain 8 digits
	@Id
	@Column(name = "pArticle")
	private String pArticle;

	// article title
	@Column(name = "pTitleArticle")
	private String pTitleArticle;

	// quantity measured in square meters or pieces
	@Column(name = "pQuantity")
	private double pQuantity;

	/*
	 * public Integer getIdPBalance() { return idPBalance; }
	 * 
	 * public void setIdPBalance(Integer idPBalance) { this.idPBalance =
	 * idPBalance; }
	 **/

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

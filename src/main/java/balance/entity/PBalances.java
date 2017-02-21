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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPBalance == null) ? 0 : idPBalance.hashCode());
		result = prime * result + ((pArticle == null) ? 0 : pArticle.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((pTitleArticle == null) ? 0 : pTitleArticle.hashCode());
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
		PBalances other = (PBalances) obj;
		if (idPBalance == null) {
			if (other.idPBalance != null)
				return false;
		} else if (!idPBalance.equals(other.idPBalance))
			return false;
		if (pArticle == null) {
			if (other.pArticle != null)
				return false;
		} else if (!pArticle.equals(other.pArticle))
			return false;
		if (Double.doubleToLongBits(pQuantity) != Double.doubleToLongBits(other.pQuantity))
			return false;
		if (pTitleArticle == null) {
			if (other.pTitleArticle != null)
				return false;
		} else if (!pTitleArticle.equals(other.pTitleArticle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PBalances [idPBalance=" + idPBalance + ", pArticle=" + pArticle + ", pTitleArticle=" + pTitleArticle
				+ ", pQuantity=" + pQuantity + "]";
	}

}

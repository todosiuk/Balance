package balance.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//this class contains data Qguar
@Entity
@Table(name = "QBalances")
public class QBalances implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer idQBalance;

	// always contain 8 digits
	@Column(name = "article")
	private String qArticle;

	// title article
	@Column(name = "title")
	private String qTitleArticle;

	// quantity measured in square meters or pieces
	@Column(name = "quantity")
	private Double qQuantity;

	public Integer getIdQBalance() {
		return idQBalance;
	}

	public void setIdQBalance(Integer idQBalance) {
		this.idQBalance = idQBalance;
	}

	public double getqQuantity() {
		return qQuantity;
	}

	public void setqQuantity(double qQuantity) {
		this.qQuantity = qQuantity;
	}

	public String getqArticle() {
		return qArticle;
	}

	public void setqArticle(String qArticle) {
		this.qArticle = qArticle;
	}

	public String getqTitleArticle() {
		return qTitleArticle;
	}

	public void setqTitleArticle(String qTitleArticle) {
		this.qTitleArticle = qTitleArticle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idQBalance == null) ? 0 : idQBalance.hashCode());
		result = prime * result + ((qArticle == null) ? 0 : qArticle.hashCode());
		result = prime * result + ((qQuantity == null) ? 0 : qQuantity.hashCode());
		result = prime * result + ((qTitleArticle == null) ? 0 : qTitleArticle.hashCode());
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
		QBalances other = (QBalances) obj;
		if (idQBalance == null) {
			if (other.idQBalance != null)
				return false;
		} else if (!idQBalance.equals(other.idQBalance))
			return false;
		if (qArticle == null) {
			if (other.qArticle != null)
				return false;
		} else if (!qArticle.equals(other.qArticle))
			return false;
		if (qQuantity == null) {
			if (other.qQuantity != null)
				return false;
		} else if (!qQuantity.equals(other.qQuantity))
			return false;
		if (qTitleArticle == null) {
			if (other.qTitleArticle != null)
				return false;
		} else if (!qTitleArticle.equals(other.qTitleArticle))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "QBalances [idQBalance=" + idQBalance + ", qArticle=" + qArticle + ", qTitleArticle=" + qTitleArticle
				+ ", qQuantity=" + qQuantity + "]";
	}

}

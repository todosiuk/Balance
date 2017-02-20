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

}

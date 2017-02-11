package balance.entity;

//this class contains data Qguar
public class QBalances {

	//private Integer idQBalance;

	// always contain 8 digits
	private String qArticle;

	// title article
	private String qTitleArticle;

	// quantity measured in square meters or pieces
	private double qQuantity;

	/*public Integer getIdQBalance() {
		return idQBalance;
	}

	public void setIdQBalance(Integer idQBalance) {
		this.idQBalance = idQBalance;
	}**/

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

package Entity;

//this class contains data Potamus
public class PBalances {

	private Integer idPBalance;

	// always contain 8 digits
	private String pArticle;

	// article title
	private String pTitleArticle;

	// quantity measured in square meters or pieces
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

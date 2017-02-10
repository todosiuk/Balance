package Entity;

//this class contains data Potamus
public class PBalances {

	private Integer idPBalance;

	// always contain 8 digits
	private String pVendorCode;

	// quantity measured in square meters or pieces
	private double pQuantity;

	public Integer getIdPBalance() {
		return idPBalance;
	}

	public void setIdPBalance(Integer idPBalance) {
		this.idPBalance = idPBalance;
	}

	public String getpVendorCode() {
		return pVendorCode;
	}

	public void setpVendorCode(String pVendorCode) {
		this.pVendorCode = pVendorCode;
	}

	public double getpQuantity() {
		return pQuantity;
	}

	public void setpQuantity(double pQuantity) {
		this.pQuantity = pQuantity;
	}
}

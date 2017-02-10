package Entity;

//this class contains data Qguar
public class QBalances {

	private Integer idQBalance;

	// always contain 8 digits
	private String qVendorCode;

	// quantity measured in square meters or pieces
	private double qQuantity;

	public Integer getIdQBalance() {
		return idQBalance;
	}

	public void setIdQBalance(Integer idQBalance) {
		this.idQBalance = idQBalance;
	}

	public String getqVendorCode() {
		return qVendorCode;
	}

	public void setqVendorCode(String qVendorCode) {
		this.qVendorCode = qVendorCode;
	}

	public double getqQuantity() {
		return qQuantity;
	}

	public void setqQuantity(double qQuantity) {
		this.qQuantity = qQuantity;
	}

}

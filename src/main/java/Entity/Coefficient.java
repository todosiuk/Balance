package Entity;

public class Coefficient {

	private Integer idCoefficient;

	// always contain 8 digits
	private String vendorCode;

	// coefficient (Length * width)
	private double coef;

	public Integer getIdCoefficient() {
		return idCoefficient;
	}

	public void setIdCoefficient(Integer idCoefficient) {
		this.idCoefficient = idCoefficient;
	}

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(double coef) {
		this.coef = coef;
	}

}

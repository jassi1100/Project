package config;

public class ProductPrices {
	private String gisId;
	
	private String productName;
	
	private double basePrice;
	
	private double containerServiceCharge;
	
	private double fuelPercentage;
	
	private double environmentalFeePercentage;
	
	private double adminFee;
	
	private double deliveryFee;
	
	private double additionalTonnage;
	
	private double rmo;
	
	private double rcr;
	
	private double usageFee;
	
	private double tax;

	public ProductPrices(String gisId, String productName, double basePrice, double containerServiceCharge,
			double fuelPercentage, double environmentalFeePercentage, double adminFee, double deliveryFee,
			double additionalTonnage, double rmo, double rcr, double usageFee, double tax) {
		super();
		this.gisId = gisId;
		this.productName = productName;
		this.basePrice = basePrice;
		this.containerServiceCharge = containerServiceCharge;
		this.fuelPercentage = fuelPercentage;
		this.environmentalFeePercentage = environmentalFeePercentage;
		this.adminFee = adminFee;
		this.deliveryFee = deliveryFee;
		this.additionalTonnage = additionalTonnage;
		this.rmo = rmo;
		this.rcr = rcr;
		this.usageFee = usageFee;
		this.tax = tax;
	}

	/**
	 * @return the tax
	 */
	public double getTax() {
		return tax;
	}

	/**
	 * @param tax the tax to set
	 */
	public void setTax(double tax) {
		this.tax = tax;
	}

	/**
	 * @return the gisId
	 */
	public String getGisId() {
		return gisId;
	}

	/**
	 * @param gisId the gisId to set
	 */
	public void setGisId(String gisId) {
		this.gisId = gisId;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the basePrice
	 */
	public double getBasePrice() {
		return basePrice;
	}

	/**
	 * @param basePrice the basePrice to set
	 */
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}

	/**
	 * @return the containerServiceCharge
	 */
	public double getContainerServiceCharge() {
		return containerServiceCharge;
	}

	/**
	 * @param containerServiceCharge the containerServiceCharge to set
	 */
	public void setContainerServiceCharge(double containerServiceCharge) {
		this.containerServiceCharge = containerServiceCharge;
	}

	/**
	 * @return the fuelPercentage
	 */
	public double getFuelPercentage() {
		return fuelPercentage;
	}

	/**
	 * @param fuelPercentage the fuelPercentage to set
	 */
	public void setFuelPercentage(double fuelPercentage) {
		this.fuelPercentage = fuelPercentage;
	}

	/**
	 * @return the environmentalFeePercentage
	 */
	public double getEnvironmentalFeePercentage() {
		return environmentalFeePercentage;
	}

	/**
	 * @param environmentalFeePercentage the environmentalFeePercentage to set
	 */
	public void setEnvironmentalFeePercentage(double environmentalFeePercentage) {
		this.environmentalFeePercentage = environmentalFeePercentage;
	}

	/**
	 * @return the adminFee
	 */
	public double getAdminFee() {
		return adminFee;
	}

	/**
	 * @param adminFee the adminFee to set
	 */
	public void setAdminFee(double adminFee) {
		this.adminFee = adminFee;
	}

	/**
	 * @return the deliveryFee
	 */
	public double getDeliveryFee() {
		return deliveryFee;
	}

	/**
	 * @param deliveryFee the deliveryFee to set
	 */
	public void setDeliveryFee(double deliveryFee) {
		this.deliveryFee = deliveryFee;
	}

	/**
	 * @return the additionalTonnage
	 */
	public double getAdditionalTonnage() {
		return additionalTonnage;
	}

	/**
	 * @param additionalTonnage the additionalTonnage to set
	 */
	public void setAdditionalTonnage(double additionalTonnage) {
		this.additionalTonnage = additionalTonnage;
	}

	/**
	 * @return the rmo
	 */
	public double getRmo() {
		return rmo;
	}

	/**
	 * @param rmo the rmo to set
	 */
	public void setRmo(double rmo) {
		this.rmo = rmo;
	}

	/**
	 * @return the rcr
	 */
	public double getRcr() {
		return rcr;
	}

	/**
	 * @param rcr the rcr to set
	 */
	public void setRcr(double rcr) {
		this.rcr = rcr;
	}

	/**
	 * @return the usageFee
	 */
	public double getUsageFee() {
		return usageFee;
	}

	/**
	 * @param usageFee the usageFee to set
	 */
	public void setUsageFee(double usageFee) {
		this.usageFee = usageFee;
	}


	
}

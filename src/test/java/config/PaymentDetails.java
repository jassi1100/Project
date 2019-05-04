package config;

public class PaymentDetails {
	private String customerId;
	private String zip;
	private String lob;
	private String flow;
	private String paymentMethod;
	private String invoiceId;
	private String amount;
	private String payMode;
	private String confirmationNumber;
	private String dbPITable;
	private String dbPTTable;
	private String requestId;
	private String profileId;
	private String cybsValidation;
	private String masVerification;
	/**
	 * @return the masVerification
	 */
	public String getMasVerification() {
		return masVerification;
	}
	/**
	 * @param masVerification the masVerification to set
	 */
	public void setMasVerification(String masVerification) {
		this.masVerification = masVerification;
	}
	/**
	 * @return the customerId
	 */
	public String getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}
	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}
	/**
	 * @return the lob
	 */
	public String getLob() {
		return lob;
	}
	/**
	 * @param lob the lob to set
	 */
	public void setLob(String lob) {
		this.lob = lob;
	}
	/**
	 * @return the flow
	 */
	public String getFlow() {
		return flow;
	}
	/**
	 * @param flow the flow to set
	 */
	public void setFlow(String flow) {
		this.flow = flow;
	}
	/**
	 * @return the paymentMethod
	 */
	public String getPaymentMethod() {
		return paymentMethod;
	}
	/**
	 * @param paymentMethod the paymentMethod to set
	 */
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	/**
	 * @return the invoiceId
	 */
	public String getInvoiceId() {
		return invoiceId;
	}
	/**
	 * @param invoiceId the invoiceId to set
	 */
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the payMode
	 */
	public String getPayMode() {
		return payMode;
	}
	/**
	 * @param payMode the payMode to set
	 */
	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
	/**
	 * @return the confirmationNumber
	 */
	public String getConfirmationNumber() {
		return confirmationNumber;
	}
	/**
	 * @param confirmationNumber the confirmationNumber to set
	 */
	public void setConfirmationNumber(String confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}
	/**
	 * @return the dbPITable
	 */
	public String getDbPITable() {
		return dbPITable;
	}
	/**
	 * @param dbPITable the dbPITable to set
	 */
	public void setDbPITable(String dbPITable) {
		this.dbPITable = dbPITable;
	}
	/**
	 * @return the dbPTTable
	 */
	public String getDbPTTable() {
		return dbPTTable;
	}
	/**
	 * @param dbPTTable the dbPTTable to set
	 */
	public void setDbPTTable(String dbPTTable) {
		this.dbPTTable = dbPTTable;
	}
	/**
	 * @return the requestId
	 */
	public String getRequestId() {
		return requestId;
	}
	/**
	 * @param requestId the requestId to set
	 */
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	/**
	 * @return the profileId
	 */
	public String getProfileId() {
		return profileId;
	}
	/**
	 * @param profileId the profileId to set
	 */
	public void setProfileId(String profileId) {
		this.profileId = profileId;
	}
	/**
	 * @return the cybsValidation
	 */
	public String getCybsValidation() {
		return cybsValidation;
	}
	/**
	 * @param cybsValidation the cybsValidation to set
	 */
	public void setCybsValidation(String cybsValidation) {
		this.cybsValidation = cybsValidation;
	}
	
	public PaymentDetails(String customerId, String zip, String lob, String flow, String paymentMethod,
			String invoiceId, String amount, String payMode, String confirmationNumber, String dbPITable,
			String dbPTTable, String requestId, String masVerification,String profileId, String cybsValidation) {
		
		this.customerId = customerId;
		this.zip = zip;
		this.lob = lob;
		this.flow = flow;
		this.paymentMethod = paymentMethod;
		this.invoiceId = invoiceId;
		this.amount = amount;
		this.payMode = payMode;
		this.confirmationNumber = confirmationNumber;
		this.dbPITable = dbPITable;
		this.dbPTTable = dbPTTable;
		this.requestId = requestId;
		this.profileId = profileId;
		this.cybsValidation = cybsValidation;
		this.masVerification = masVerification;
	}
	
	
	
	
	
}

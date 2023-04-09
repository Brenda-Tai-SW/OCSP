package main.model;

public class Certificate {
	
	
	private String issuerNameHash;
    private String issuerKeyHash;
    private String serialNumber;

    public String getIssuerNameHash() {
		return issuerNameHash;
	}

	public void setIssuerNameHash(String issuerNameHash) {
		this.issuerNameHash = issuerNameHash;
	}

	public String getIssuerKeyHash() {
		return issuerKeyHash;
	}

	public void setIssuerKeyHash(String issuerKeyHash) {
		this.issuerKeyHash = issuerKeyHash;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	

    public String toString() {
        return "Certificate [\n\t\t\t\t Issuer Name Hash=" + issuerNameHash + ",\n\t\t\t\t Issuer Key Hash=" + issuerKeyHash + ",\n\t\t\t\t SerialNumber="
                + serialNumber + "\n\t\t\t]";
    }
}

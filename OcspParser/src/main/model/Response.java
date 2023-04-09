package main.model;

import java.util.Date;


public class Response {
	
	private Date thisUpdate;
    private Date nextUpdate;
    private Certificate certificate;
    private String certStatus;

    public Date getThisUpdate() {
		return thisUpdate;
	}


	public void setThisUpdate(Date thisUpdate) {
		this.thisUpdate = thisUpdate;
	}


	public Date getNextUpdate() {
		return nextUpdate;
	}


	public void setNextUpdate(Date nextUpdate) {
		this.nextUpdate = nextUpdate;
	}


	public Certificate getCertificate() {
		return certificate;
	}


	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}


	public String getCertStatus() {
		return certStatus;
	}


	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus;
	}




    
    public String toString() {
        return "\n\t\tResponse [\n\t\t\tThis Update=" + thisUpdate + ",\n\t\t\t Next Update=" + nextUpdate + ",\n\t\t\t" + certificate
                + ",\n\t\t\t Cert Status=" + certStatus + "\n\t]";
    }

}


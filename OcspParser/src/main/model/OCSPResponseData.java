package main.model;


import java.util.Date;
import java.util.List;


public class OCSPResponseData {
	
	private String status;
    private int version;
    private Date producedAt;
    private String responderId;
    private List<Response> responses;

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Date getProducedAt() {
		return producedAt;
	}

	public void setProducedAt(Date producedAt) {
		this.producedAt = producedAt;
	}

	public String getResponderId() {
		return responderId;
	}

	public void setResponderId(String responderId) {
		this.responderId = responderId;
	}

	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	


    public String toString() {
        return "OCSPResponseData [\n\tResponse Status=" + status + ",\n\t Version=" + version + ",\n\t Produced At=" + producedAt
                + ",\n\t Responder Id=" + responderId + ",\n\t Responses=" + responses + "\n]";
    }

}

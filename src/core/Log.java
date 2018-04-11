package core;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * The Log class represents a single action of a client, with all it's details.
 */
public class Log {

	private long timestamp;
	private int clientId;
	private String description;
	private float amount;

	/**
	 * create a Log object with the specified details.
	 * 
	 * @param timestamp
	 *            the time when this operation took place.
	 * @param clientId
	 *            the id of the client making the transaction.
	 * @param description
	 *            the description of the operation.
	 * @param amount
	 *            the amount of operation.
	 */
	public Log(long timestamp, int clientId, String description, float amount) {
		super();
		this.timestamp = timestamp;
		this.clientId = clientId;
		this.description = description;
		this.amount = amount;
	}

	public String getData() {
		//Get todays date and time
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//dd/MM/yyyy
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
		return "Log [timestamp=" + strDate + ", clientId=" + clientId + ", description=" + description + ", amount="
				+ amount + "]";
	}

}

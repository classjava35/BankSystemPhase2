package core;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;

public class Bank {
	private Client[] clients ;
	private  Logger logService;
	//account updater; leave this one for now
	private Logger logger;
	private float balance;
	

	public Bank() {
		super();
		logService = new Logger("driverName");
		logger = new Logger("driverName");
		this.balance = balance;
		clients = new Client[100];
	}

	public void setBalance(Bank b1) {
		float balance =0;
		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null ) {
				balance+=clients[i].getFortune();
			}
		}
		this.balance = balance;	
		// log the operation
		Log log = new Log(System.currentTimeMillis(), 1 , "set Bank Balance", balance);
		logger.log(log);
		
		this.balance = balance;
	
	}

	public float getBalance() {
		return balance;
	}
	
	public void addClient(Client client) {
		for (int i = 0; i < clients.length; i++) {
				if (clients[i] == null) {
					clients[i] = client; // add the client
					setBalance(this); // add the client balance to the Bank Balance
					// log the operation
					Log log = new Log(System.currentTimeMillis(), client.getId(), "add account", client.getBalance());
					logger.log(log);
					//
					break;
			}
		}		
	}
	

	public void removeClient(int id){

		for (int i = 0; i < clients.length; i++) {
			if (clients[i] != null && clients[i].getId()== id ) {
				float client_balance = clients[i].getFortune();
				this.balance-= client_balance;
				clients[i] = null; // add the account
				// log the operation
				Log log = new Log(System.currentTimeMillis(), id , "remove client", this.getBalance());
				logger.log(log);
				//
				break;
			}
		}
	}
	
	public Client[] getClients() {
		return clients;
	}

	public void viewLogs() {
		 //prints all logs that are stored in the logger - leave empty for now
	}

	public void startAccountUpdater() {
		 // leave empty for now
	}
}

package core.testings;

import core.Account;
import core.Bank;
import core.Client;
import core.Log;
import core.Logger;

public class Test2 {

	public static void main(String[] args) {

		// Bank leumi CTOR
		System.out.println("** Creation of New Bank Leumi **");
		Bank leumi = new Bank();
		
		// Bank hapoalim CTOR
		System.out.println("** Creation of New Bank Hapoalim **");
		Bank hapoalim = new Bank();

		
		// Client CTOR
		System.out.println();
		System.out.println("** Creation of New Client c1 for 'Moshe Levi' id 101 with 5,000 balance **");
		Client c1 = new Client(101, "Moshe Levi", 5_000);
		System.out.println();
		
		System.out.println("** Creation of New Client c2 for 'Sara Levi' id 102 with 10,000 balance **");
		Client c2 = new Client(102, "Sara levi", 10_000);
		System.out.println();
		
		System.out.println("** Creation of New Client c3 for 'Lior Levi' id 103 with 15,000 balance **");
		Client c3 = new Client(103, "Lior levi", 15_000);
		System.out.println();
		
		//Adding Clients to Banks
		System.out.println("*** Adding Clients to Banks ***");
		System.out.println();
		System.out.println("*******   adding Moshe Levi client 1 to Bank 1  Leumi************");
		leumi.addClient(c1);//adding Moshe Levi client 1 to Bank 1
		System.out.println();

		System.out.println();
		System.out.println("*******   adding Sara Levi client 2 to Bank 1 Leumi ************");
		leumi.addClient(c2);//adding Sara Levi client 2 to Bank 1
				
				
		System.out.println("Bank Leumi current Balance is : "+leumi.getBalance()); 
		
		System.out.println();
		System.out.println("*******   adding Lior Levi client 3 to Bank 2  Hapoalim ************");
		hapoalim.addClient(c3);//adding Lior Levi client 3 to Bank 2
		System.out.println();
		
		System.out.println();

		//Adding or removing  accounts to the Customers
		System.out.println("** Add first Account Under customer 'Moshe Levi' id 101 with 25,000 balance **");
		c1.addAccount(new Account(5001, 25_000));
		System.out.println();
		
		System.out.println("** Get account ID at for Account in index 0 **");
		System.out.println(c1.getAccounts(0).getId());
		System.out.println();

		System.out.println("** Add Second Account Under customer 'Moshe Levi' id 101 with 45,000 balance **");
		Account account = new Account(6001, 45_000);
		c1.addAccount(account);
		System.out.println();
		
		System.out.println("** Get account ID at for Account in index 1 **");
		System.out.println(c1.getAccounts(1).getId());
		System.out.println();
		
		
		System.out.println("** Remove account ID 6001 **");
		c1.removeAccount(6001);
		System.out.println();
		
		
		System.out.println("** Add three Accounts Under customer 'Sara Levi' id 102 with 10,000 balance each**");
		c2.addAccount(new Account(7001, 10_000));
		c2.addAccount(new Account(8001, 10_000));
		c2.addAccount(new Account(9001, 10_000));
		System.out.println();
		
		c2.deposit(60) ;
		c2.withdraw(20);

		
		System.out.println("Client 2 - 'Sara Levi' Total balance All accounts+ balance is : "+c2.getFortune());
		


		//Bank Balance before setting
		System.out.println();
		System.out.println("***Bank 1 Leumi Balance before setting***");
		System.out.println(leumi.getBalance());
		System.out.println();


		//Set Bank Balance
		System.out.println("***Set Bank 1 Leumi Balance including all Sub-Accounts***");
		leumi.setBalance(leumi);

		//Bank Balance After setting
		System.out.println();
		System.out.println("***Bank 1 Leumi Balance After setting***");
		System.out.println(leumi.getBalance());
		
		//remove Client
		System.out.println("***  remove Client 102 Sara Levi *****");
		leumi.removeClient(102);
	}
}

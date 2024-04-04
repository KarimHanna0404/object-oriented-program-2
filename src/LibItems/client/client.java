package LibItems.client;

import java.util.Objects;

public class client {
	
	private int ID; 
	private String NameClient; 
	private int Phonenumber; 
	private String emailAddress;
	private String leasedItemID =null;
	
	

	// Copy constructor
    public client (client other) {
        this.ID = other.ID;
        this.NameClient = other.NameClient;
        this.Phonenumber = other.Phonenumber;
        this.emailAddress = other.emailAddress;
        
    }
	//default constructor
	public client () {
		
		ID = 0;
		this.NameClient="";
		this.emailAddress = "";
		Phonenumber = 0;
		
	}
	//parameratrized constructor
	
	public client (int ID, String NameClient, int Phonenumber, String emailAddress) {
		
		this.ID = ID;
		this.NameClient = NameClient;
		this.Phonenumber = Phonenumber;
		this.emailAddress = emailAddress;
	}
	
	
	
	//getters and setters
	
	public String getLeasedItemId() {
		return leasedItemID;
	}
	
	public void setLeasedItemId(String LeasedItemID) {
		this.leasedItemID = leasedItemID;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNameClient() {
		return NameClient;
	}
	public void setNameClient(String nameClient) {
		NameClient = nameClient;
	}
	public int getPhonenumber() {
		return Phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		Phonenumber = phonenumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	
	//equals method
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		client other = (client) obj;
		return ID == other.ID && Objects.equals(NameClient, other.NameClient) && Phonenumber == other.Phonenumber
				&& Objects.equals(emailAddress, other.emailAddress);
	}
	
	//prints out info
	public String toString() {
		return "client [ID=" + ID + ", NameClient=" + NameClient + ", Phonenumber=" + Phonenumber + ", emailAddress="
				+ emailAddress + "]";
	}
	
	
	
	
	
	
	
	

}

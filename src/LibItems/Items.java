package LibItems;

import java.util.Objects;

abstract public class Items {
	
	protected int ID;
	protected String nameofauthor;
	protected int yearofpublication;
	protected String name;
	protected String leaseToClientID = null; //attribute to track which client has leased an item

	// Copy constructor
    public Items (Items other) {
        this.ID = other.ID;
        this.nameofauthor= other.nameofauthor;
        this.yearofpublication = other.yearofpublication;
        this.name= other.name;
        this.leaseToClientID = other.leaseToClientID;
        
    }
	//default constructor
	public Items() {
		
		this.ID=0;
		this.nameofauthor="";
		this.yearofpublication = 0;
		this.name="";
		this.leaseToClientID="";
		
	}
	
	//parameratrized constructor
	public Items(int ID, String nameofauthor, int yearofpublication, String name) {
		
		this.ID = ID;
		this.nameofauthor = nameofauthor;
		this.yearofpublication = yearofpublication;
		this.name = name;
	
	}
	
	
	//getters and setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getNameofauthor() {
		return nameofauthor;
	}
	public void setNameofauthor(String nameofauthor) {
		this.nameofauthor = nameofauthor;
	}
	public int getYearofpublication() {
		return yearofpublication;
	}
	public void setYearofpublication(int yearofpublication) {
		this.yearofpublication = yearofpublication;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public boolean equals(Object obj) {
		super.equals(obj);
		   //comparing object with itself
     if (this == obj) {
         return true;
     }

     //if object is null or different type
     if (obj == null || getClass() != obj.getClass()) {
         return false;
     }
     // Cast the object to book type for attribute comparison
     Items other = (Items) obj;

     // Compare all attributes except ID
     if (!name.equals(other.name) || !nameofauthor.equals(other.nameofauthor) || yearofpublication != other.yearofpublication){
         return false;
	
	}
     
     return true;
	}

		
	

	
	public String toString() {
		return "Items [ID=" + ID + ", nameofauthor=" + nameofauthor + ", yearofpublication=" + yearofpublication
				+ ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	
	

}

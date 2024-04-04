package LibItems;


public class book extends Items {
	
	protected int numberofpages;

	//parameratrized constructor
	public book(int ID, String nameofauthor, int yearofpublication, String name, int numberofpages) {
		super(ID, nameofauthor, yearofpublication, name);
		
		this.numberofpages = numberofpages;
	}
	
	
	//default constructor
	 public book () {
		 super();
		 this.numberofpages=0;
	 }
	 
	 //copy constructor
	 public book (book other) {
		 
		 super (other);
		 this.numberofpages = other.numberofpages;
		 
	 }

	public int getNumberofpages() {
		return numberofpages;
	}

	public void setNumberofpages(int numberofpages) {
		this.numberofpages = numberofpages;
	}

	

	@Override
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
        book other = (book) obj;

        // Compare all attributes except ID
        if (!name.equals(other.name) || !nameofauthor.equals(other.nameofauthor) || yearofpublication != other.yearofpublication||(numberofpages != other.numberofpages)){
            return false;
	
	}
        
        return true;
	}

	@Override
	public String toString() {
		return "book [numberofpages=" + numberofpages + ", ID=" + ID + ", nameofauthor=" + nameofauthor
				+ ", yearofpublication=" + yearofpublication + ", name=" + name + "]";
	}


	 
	
	
	 
	

}

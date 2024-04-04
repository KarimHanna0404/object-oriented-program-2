package LibItems;

import java.util.Objects;

public class journal extends Items {

	 protected String volumenumber;
	
	public journal(int ID, String nameofauthor, int yearofpublication, String name, String volumenumber) {
		super(ID, nameofauthor, yearofpublication, name);
		
		this.volumenumber = volumenumber;
		
	}

	//copy constructor
	public journal(journal other) {
		super(other);
		this.volumenumber = other.volumenumber;
	}
	

	public journal() {
		super();
		this.volumenumber = "";
	
	}

	public String getVolumenumber() {
		return volumenumber;
	}

	public void setVolumenumber(String volumenumber) {
		this.volumenumber = volumenumber;
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
     journal other = (journal) obj;

     // Compare all attributes except ID
     if (!name.equals(other.name) || !nameofauthor.equals(other.nameofauthor) || yearofpublication != other.yearofpublication){
         return false;
	
	}
     
     return true;
	}


	@Override
	public String toString() {
		return "journal [volumenumber=" + volumenumber + ", ID=" + ID + ", nameofauthor=" + nameofauthor
				+ ", yearofpublication=" + yearofpublication + ", name=" + name + "]";
	}


}

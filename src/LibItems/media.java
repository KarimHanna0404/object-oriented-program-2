package LibItems;

import java.util.Objects;

public class media extends Items{
	
	protected String mediatype;

	public media(int ID, String nameofauthor, int yearofpublication, String name,String mediatype) {
		super(ID, nameofauthor, yearofpublication, name);
		this.mediatype = mediatype;
	}
	

	public media() {
		super();
		this.mediatype= "";

	}


	public media(media other) {
		super(other);
		this.mediatype =other.mediatype;

	}


	public String getMediatype() {
		return mediatype;
	}


	public void setMediatype(String mediatype) {
		this.mediatype = mediatype;
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
     media other = (media) obj;

     // Compare all attributes except ID
     if (!name.equals(other.name) || !nameofauthor.equals(other.nameofauthor) || yearofpublication != other.yearofpublication||!(mediatype.equals(other.mediatype))){
         return false;
	
	}
     
     return true;
	}

	


	@Override
	public String toString() {
		return "media [mediatype=" + mediatype + ", ID=" + ID + ", nameofauthor=" + nameofauthor
				+ ", yearofpublication=" + yearofpublication + ", name=" + name + "]";
	}
	
	
	
	
	
	
	
	

}

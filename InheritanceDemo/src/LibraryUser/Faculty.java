package LibraryUser;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Faculty")
public class Faculty extends User1 {

	private int facid;
	private String dept;
	
	public Faculty()
	{
		
	}

	public Faculty(int facid, String dept) {
//		super(userid, name);
		this.facid = facid;
		this.dept = dept;
	}
	
	public Faculty(int userid, String name, int facid, String dept) {
		super(userid, name);
		this.facid = facid;
		this.dept = dept;
	}


	public int getFacid() {
		return facid;
	}

	public void setFacid(int facid) {
		this.facid = facid;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}

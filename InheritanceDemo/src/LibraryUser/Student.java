package LibraryUser;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Student")
public class Student extends User1 
{
	private int rollno;
	private String branch;
	
	public Student(){
		
	}
	
	public Student(int userid, String name, int rollno, String branch) {
		super(userid, name);
		this.rollno = rollno;
		this.branch = branch;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	

}

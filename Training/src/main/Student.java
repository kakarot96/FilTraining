package main;

public class Student {
	static int rolls=1;
private String name,fathername,address; 
private int rollnum;

	Student(){
		setNAME(null);
		setfatherName(null);
		setAddress(null);
		setRollNum();
		}
	
	
	
	Student(String name){
		setNAME(name);
		setfatherName(null);
		setAddress(null);
		setRollNum();
	}
	
	
	
	
	
	Student(String name, String fathername){
		setNAME(name);
		setfatherName(fathername);
		setAddress(null);
		setRollNum();
		
	}
	Student(String name,String fathername,String address){
		setNAME(name);
		setfatherName(fathername);
		setAddress(address);
		setRollNum();
	}
	
	void show(){
		System.out.println(name+"  "+fathername+"  "+address+"  "+rollnum);
	}
	
	public void setNAME(String name){
		if(name==null)name="---";
		else if(name.length()<4)name+="---";
		this.name=name;
	}
	void setfatherName(String fathername){
		if(fathername==null)fathername="---";
		else if(fathername.length()<4)fathername+="---";
		this.fathername=fathername;
	}
	void setAddress(String address){
		if(address==null)address="---";
		else if(address.length()<4)address+="---";
		this.address=address;
	}
	void setRollNum(){
		this.rollnum=rolls;
		rolls++;
	}
	
}

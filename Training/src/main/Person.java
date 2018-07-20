package main;

public class Person {
	private String name;
	public Person father,son;
	private int room;
	
	
	public Person(String string, int i) {
		// TODO Auto-generated constructor stub
		setName(string);
		room=i;
		father=null;
		son=null;
		
	}
	void setName(String name){
		this.name=name;
	}
	void setFather(Person p){
		this.father=p;
		p.son=this;
	}
	void setSon(Person p){
		this.son=p;
		p.father=this;
	}
	
	Person getFather(){
		return this.father;
	}
	String getName(){
		return this.name;
	}
	
	void printFamily(){
		Person x=this;
		while(x.father!=null)
			x=x.father;
		while(x.son!=null)
		{
			System.out.println(x.name+"  "+room);
			x=x.son;
		}
		System.out.println(x.name+"  "+room);

	}
}

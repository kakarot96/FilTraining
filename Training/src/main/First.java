package main;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//  Assignment 2
		System.out.print("Assignment 2");
		Box obj1 =new Box();
		Box obj2= new Box(5);
		Box obj3= new Box(2,3,4);
		
		obj1.show();
		obj2.show();
		obj3.show();
		System.out.println();
		
		obj1.volume();
		obj2.volume();
		obj3.volume();
		System.out.println();
		
		Box a=obj1.biggerBox(obj2);
		Box b=obj2.biggerBox(obj3);
		Box c=obj3.biggerBox(obj1);
		
		a.show();
		b.show();
		c.show();
		
		int l=obj3.getLENGTH();
		System.out.println(l);
	//       Assignment 1	
		System.out.println("Assignment 1");
		
		Point x=new Point(5,6);
		Point y=new Point(3,4);
		Point z=x.far(y);
		z.show();
		
	// Assignment 3
		
		Student s1=new Student();
		Student s2=new Student("Ak");
		Student s3=new Student(null,"father");
		Student s4=new Student("student","father","address");
		s1.show();
		s2.show();
		s3.show();
		s4.show();
		
	
		
	}

}


package main;

public class DemoInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Figure f=new Figure();
		Rectangle r=new Rectangle(2.5,2.5);
		Circle c=new Circle(2.5);
		
		System.out.println(f.area());
		System.out.println(r.area());
		System.out.println(c.area());
		f= r;
		System.out.println(f.area());
		f=c;
		System.out.println(f.area());

		
		
		Figure[] arr=new Figure[5];
		arr[0]=new Figure();
		arr[1]=new Rectangle(1,2);
		arr[2]=new Rectangle(2,3);
		arr[3]=new Circle(2);
		arr[4]=new Circle(3);
		
		System.out.println("Sum of area is "+sumArea(arr));
	}

	public static double sumArea(Figure[] arr){
		double totalArea=0;
		for(int i=0;i<arr.length;i++){
			totalArea+= arr[i].area();
		}
		
		return totalArea;
	}
}

package main;

public class Point {
	static int count=0;
	
	int x,y;
	Point(){
		x=0;y=0;
		count++;
	}
	Point(int a,int b){
		x=a;y=b;
		count++;
	}
	void show(){
		System.out.println(x+"  "+y);
	}
	public static void showCount(){
		System.out.println(count);
	}
	Point far(Point b){
		double d1= Math.sqrt(this.x*this.x+this.y*this.y);
		double d2= Math.sqrt(b.x*b.x+b.y*b.y);
		if(d1>d2)return this;
		else return b;
	}
}

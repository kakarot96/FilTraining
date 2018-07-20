package main;

public class Box {

	private int length,width,height;
	
	Box(){
		length=0;width=0;height=0;
	}
	Box(int a){
		length=a;width=a;height=a;
	}
	Box(int a,int b,int c){
		length=a;width=b;height=c;
	}
	
// Show Dimensions	
	 void show(){
		 System.out.println(length+" "+width+" "+height);
	 }
// Show Volume of the Box
	 void volume(){
		 int vol=length*width*height;
		 System.out.println(vol);
		 
	 }
// Bigger Box	 
	 Box biggerBox(Box a){
		int v1= length*width*height;
		int v2= a.length*a.width*a.height;
		 if(v1>v2)return this;
		 else return a;
		// else System.out.println("Same");
		

	 }
	 
// Setter & Getter
	 int getLENGTH(){
			return length; 
		 }
	 void setLENGTH(int length){
			 this.length=length;
		 }
	 
	 int getWIDTH(){
		return width; 
	 }
	 void setWIDTH(int width){
		 this.width=width;
	 }
	 
	 int getHEIGHT(){
			return height; 
		 }
	 void setHEIGHT(int height){
			 this.height=height;
		 }
		 
		
}

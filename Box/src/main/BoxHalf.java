package main;

public class BoxHalf extends Thread{
Box box;

public BoxHalf(Box box) {
	super();
	this.box = box;
}


public void run(){
	System.out.println("in half");
	while(true){
		box.half();
	}
}
}

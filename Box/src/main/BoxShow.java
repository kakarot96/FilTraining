package main;

public class BoxShow extends Thread {
Box box;

public BoxShow(Box box) {
	super();
	this.box = box;
}


public void run(){
	
	while(true){
		box.show();
	}
}




}

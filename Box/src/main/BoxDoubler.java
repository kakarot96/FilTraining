package main;

public class BoxDoubler extends Thread{
Box box;

public BoxDoubler(Box box) {
	super();
	this.box = box;
}

public void run(){
	
	while(true){
		
		box.doubler();
	}
	
	
}


}

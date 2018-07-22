package main;

public class BoxMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Box box = new Box(2,3,4);
		BoxDoubler doubler=new BoxDoubler(box);
		BoxHalf half=new BoxHalf(box);
		BoxShow show=new BoxShow(box);
		
		show.start();
		doubler.start();
		half.start();
		
		doubler.join();
		half.join();
		show.join();
		
		
	}

}

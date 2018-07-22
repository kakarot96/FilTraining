package main;

import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

public class Box {

	int length,breadth,height;
	
	ReentrantReadWriteLock lock=new ReentrantReadWriteLock();

	public Box(int length, int breadth, int height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
		//this.lock=null;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	 void show(){
		
		 ReadLock rlock=lock.readLock();
		 rlock.lock();
		System.out.println(this.length+" "+this.breadth+" "+this.height);
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		rlock.unlock();
	}
	
	void doubler(){
		WriteLock wlock=lock.writeLock();
		wlock.lock();
		this.length*=2;
		this.breadth*=2;
		this.height*=2;
		try {
			Thread.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wlock.unlock();
	}
	
	void half(){
		WriteLock wlock2=lock.writeLock();
		wlock2.lock();
		
		this.length/=2;
		this.breadth/=2;
		this.height/=2;
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wlock2.unlock();
	}
}

package main;

public class Patterns {
	
	public void square(int n){
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)System.out.print("* ");
			System.out.println();
		}
	}
	
	public void triangle(int n){
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)System.out.print("*");
			System.out.println();
		}
	}
	
	public void equilateral(int n){
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)System.out.print(" ");
			for(int j=0;j<2*i+1;j++)System.out.print("*");
			System.out.println();
		}
	}

}

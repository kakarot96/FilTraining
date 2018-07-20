package main;
import java.util.Scanner;

public class Day2 {

	private static Scanner in;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//    Assignment 1
		
		Point po1=new Point();
		Point po2=new Point(2,3);
		Point.showCount();
		
		//    Assignment 2
		
		Student s1=new Student("Kunal","aaaa","aaaa");
		s1.show();
		Student s2=new Student("aaa","aaa");
		s2.show();
		
		// Assignment 3
		
		in = new Scanner(System.in);
		int[][]  arr = new int[5][5];
		arr[2]=new int[2];
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=in.nextInt();
			}
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
		
//       Assignment 4
	
		
		Person[]  arr2= new Person[10];
		
		arr2[0]=new Person("a",305);
		arr2[1]=new Person("b",305);
		arr2[2]=new Person("c",305);
		arr2[3]=new Person("d",305);
		arr2[4]=new Person("e",305);
		arr2[5]=new Person("f",305);
		arr2[6]=new Person("g",305);
		arr2[7]=new Person("h",305);
		arr2[8]=new Person("i",305);
		arr2[9]=new Person("j",305);

		arr2[0].setFather(arr2[1]);
		arr2[1].setFather(arr2[2]);
		arr2[2].setFather(arr2[3]);
		arr2[4].setSon(arr2[3]);
		arr2[5].setSon(arr2[6]);
		arr2[7].setFather(arr2[6]);
		int noOfFamilies=0;
		for(int i=0;i<arr2.length;i++)
		{
			if(arr2[i].son==null)
				noOfFamilies++;
		}
		arr2[0].printFamily();
		arr2[9].printFamily();
		arr2[5].printFamily();
		System.out.println(noOfFamilies);
	}
	
}

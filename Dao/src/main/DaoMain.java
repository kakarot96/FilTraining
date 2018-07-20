package main;

import java.util.List;
import java.util.Scanner;

public class DaoMain {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	//System.out.println("add");
	Scanner scan=new Scanner(System.in);
		
		try{
			SupplierDao dao= new SupplierDaoImp();
			List<Supplier> allSuppliers= dao.getAllSuppliers();
			
			for(Supplier s:allSuppliers){
				System.out.println(s.id+":"+s.sname+":"+s.city);
			}
			System.out.println();
			Supplier sup=dao.getSupplier(4);
			System.out.println(sup.id+":"+sup.sname+":"+sup.city);
			
//			dao.addSupplier(new Supplier(Supplier.count,scan.next(),scan.next()));
//			
//				allSuppliers= dao.getAllSuppliers();
//			
//			for(Supplier s:allSuppliers){
//				System.out.println(s.id+":"+s.sname+":"+s.city);
//			}
			
			
			
			dao.deleteSupplier(dao.getSupplier(5));
	allSuppliers= dao.getAllSuppliers();
			
			for(Supplier s:allSuppliers){
				System.out.println(s.id+":"+s.sname+":"+s.city);
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
	
	scan.close();
		
		
		
	}

}

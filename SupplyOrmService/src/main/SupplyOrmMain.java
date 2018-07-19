package main;

import java.sql.Date;
import java.util.List;

import com.fil.supply.Part;
import com.fil.supply.PartDao;
import com.fil.supply.PartDaoImp;
import com.fil.supply.Quote;
import com.fil.supply.QuotesDao;
import com.fil.supply.QuotesDaoImp;
import com.fil.supply.Requirement;
import com.fil.supply.Supplier;
import com.fil.supply.SupplierDaoImp;
import com.fil.supply.Supply;
import com.fil.supply.SupplyDaoImp;

import ServiceLayer.ServiceSupply;

public class SupplyOrmMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		SupplierDaoImp daoSupplier=new SupplierDaoImp();
////		Supplier s=daoSupplier.getSupplier(2);
////		System.out.println(s);
////		
////		s=new Supplier("kunal","delhi",new Date(System.currentTimeMillis()));
////		daoSupplier.addSupplier(s);
////		List<Supplier> list=daoSupplier.getAllSuppliers();
////		for (Supplier supplier : list) {
////			System.out.println(supplier);
////		}
////		
//		
//
//		
////		SupplyDaoImp daoSupply = new SupplyDaoImp();
////		Supply sg = daoSupply.getSupply(1);
////		System.out.println(sg);
////		
////		daoSupply.deleteSupply(10);
//		
//		
////		Supply s=new Supply(1,1,10,new Date(System.currentTimeMillis()));
////		daoSupply.addSupply(s);
//		
////		List<Supply> list=daoSupply.getAllSupplies();
////		for (Supply supply : list) {
////			System.out.println(supply);
////		}
//		List<Supply> supplies=daoSupplier.getSupplier(3).getSupplies();
//		for (Supply supply : supplies) {
//			System.out.println(supply);
//		}
//		
//		PartDao daoPart = new PartDaoImp();
//		supplies=daoPart.getPart(2).getSupplies();
//		for (Supply supply : supplies) {
//			System.out.println(supply);
//		}
		
//		QuotesDao daoQuote=new QuotesDaoImp();
//		daoQuote.addQuote(new Quote());
//		System.out.println(daoQuote.getQuote(1));
	
		
		ServiceSupply service=new ServiceSupply();
		service.getQuotations(3,50);
		
	}

}

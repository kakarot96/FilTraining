package ServiceLayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Query;

import com.fil.supply.Part;
import com.fil.supply.PartDao;
import com.fil.supply.PartDaoImp;
import com.fil.supply.Quote;
import com.fil.supply.QuotesDao;
import com.fil.supply.QuotesDaoImp;
import com.fil.supply.Requirement;
import com.fil.supply.RequirementDao;
import com.fil.supply.RequirementDaoImp;
import com.fil.supply.Supplier;
import com.fil.supply.SupplierDao;
import com.fil.supply.SupplierDaoImp;
import com.fil.supply.Supply;
import com.fil.supply.SupplyDao;
import com.fil.supply.SupplyDaoImp;

public class ServiceSupply {
	RequirementDao reqDao;
	QuotesDao quoteDao;
	SupplierDao supplierDao;
	PartDao partDao;
	SupplyDao supplyDao;
	public ServiceSupply(){
		reqDao=new RequirementDaoImp();
		quoteDao=new QuotesDaoImp();
		supplierDao=new SupplierDaoImp();
		partDao=new PartDaoImp();
		supplyDao=new SupplyDaoImp();
	}

	
	public void createQuotes(Requirement req){
		List<Supplier> suppliers=supplierDao.getAllSuppliers();
		int price=50;
		for (Supplier supplier : suppliers) {
			quoteDao.addQuote(new Quote(supplier,req,price));
			price =price + 10;
		}
		
	}

	public void getQuotations(int id,int qty) {
		// TODO Auto-generated method stub
	  
		Part part=partDao.getPart(id);
		Requirement req=new Requirement(part,qty);
		reqDao.addRequirement(req);
		createQuotes(req);
		List<Quote> quotes=quoteDao.getSortedQuotes(req);
		int qtyCopy=qty;
//				count=0;
//		while(qtyCopy>0){
//			int temp=checkSupplier(quotes.get(count));
//		}
		Map<Supplier, Integer> hashMap=new HashMap<>();
		int temp;
		
		for (Quote quote : quotes) {
			//System.out.println(quote.toString());
			temp=checkSupplier(quote,qtyCopy);
			qtyCopy-=temp;
			//System.out.println("temp    :"+temp);
			if(temp!=0)
			hashMap.put(quote.getSupplier(), temp);
			if(qtyCopy<=0)break;
			
			
			
			
			
		}
		
//System.out.println("hello");

for (Map.Entry<Supplier,Integer> entry : hashMap.entrySet()) {
  Supplier key = entry.getKey();
  Integer value = entry.getValue();
  System.out.println(key.toString()+":"+value);
  // do stuff
}
	if(qtyCopy>0)System.out.println("not fulfilled");
	else System.out.println("filled");

		
		//List<Supplier> suppliers=getReqSuppliers();
		
	}


	private int checkSupplier(Quote quote,int qtyCopy) {
		// TODO Auto-generated method stub
		Supplier supplier=supplierDao.getSupplier(quote.getSupplier().getSid());
		
		List<Supply> supplies=supplier.getSupplies();
		
		
		boolean flag=false;int max=-1;Supply sup;
		for(Supply supply:supplies){
			if(supply.getPart().equals(quote.getRequirement().getPart())){
				flag=true;
				if(supply.getQty()>max){
					max=supply.getQty();
					sup=supply;
				
				}
			}
		}
		
//		if(quote.getRequirement().getQty()>supplyDao.getMaxQtySupplied(quote.getSupplier(),quote.getRequirement().getPart()))
//		{
//			
//			
//		}
		
		//System.out.println(quote.toString()+"flag is "+flag);
		
		if(supplier.getRating()<3 && flag==false )
			return 0;
		else if(supplier.getRating()>=3 && flag==false){
			return qtyCopy/2;
		}
		else if(supplier.getRating()>=3 && flag==true)
		{
			//int max=supplyDao.getMaxQtySupplied(quote.getSupplier(),quote.getRequirement().getPart());
			//System.out.println("max is "+max);
			
			
			if(qtyCopy<(3*max)/2)
			{
				return qtyCopy;
			}
			else
				return (3*max)/2;
		}
		else
			return qtyCopy;
	}





	
	
	

	
	
	
	
	
}

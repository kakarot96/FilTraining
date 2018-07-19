package com.fil.supply;

import java.util.List;

public interface SupplyDao {
public Supply getSupply(int id);
public List<Supply> getAllSupplies();
public void addSupply(Supply supply);
public void deleteSupply(int id);
public int getMaxQtySupplied(Supplier supplier, Part part);
	
	
	
	
}

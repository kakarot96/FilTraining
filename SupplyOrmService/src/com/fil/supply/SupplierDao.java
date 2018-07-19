package com.fil.supply;

import java.util.List;

public interface SupplierDao {
	public Supplier getSupplier(int id);
	public List<Supplier> getAllSuppliers();
	public void deleteSupplier(Supplier s);
	public void addSupplier(Supplier supplier);
	
	
	
	
}

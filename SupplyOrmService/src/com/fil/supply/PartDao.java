package com.fil.supply;

import java.util.List;

public interface PartDao {

	
	public List<Part> getAllParts();
	public Part getPart(int id);
	public void addPart(Part part);
	public void deletePart(Part part);
	
}

package com.fil.supply;

import java.util.List;

public interface RequirementDao {

	public void addRequirement(Requirement requirement);
	public void deleteRequirement(Requirement requirement);
	public List<Requirement> getAllRequirements();
	public Requirement getRequirement(int id);
	
	
	
}

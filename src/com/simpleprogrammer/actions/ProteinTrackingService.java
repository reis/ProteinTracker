package com.simpleprogrammer.actions;

public class ProteinTrackingService {
	
	private ProteinData proteinData;
	
	public ProteinTrackingService(ProteinData proteinData) {
		this.proteinData = proteinData;
	}

	public void addProtein(int enteredProtein) {
		proteinData.setTotal(proteinData.getTotal() + enteredProtein);
	}

}

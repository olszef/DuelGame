package com.WondersDuel.Cards;

public class ResourceAmount {
	private Resources resourceType;
	private Integer Amount;
	
	public ResourceAmount(Resources resourceType, Integer amount) {
		this.resourceType = resourceType;
		Amount = amount;
	}

	public Integer getAmount() {
		return Amount;
	}

	public void setAmount(Integer amount) {
		Amount = amount;
	}

	public Resources getResourceType() {
		return resourceType;
	}
	
}

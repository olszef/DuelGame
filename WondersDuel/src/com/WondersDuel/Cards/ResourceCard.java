package com.WondersDuel.Cards;

public class ResourceCard extends Card {
	private Resources[] producedResource;
	private Integer resourceAmount;

	public ResourceCard(String age, CardTypes cardType, String cardName, Integer victoryPoints,
			ResourceAmount[] resourceCost, Integer moneyCost, Boolean canCostFree, FreeConditions freeCost,
			Boolean canAllowFree, FreeConditions freeAllow, Resources[] producedResource, Integer resourceAmount) {
		super(age, cardType, cardName, victoryPoints, resourceCost, moneyCost, canCostFree, freeCost, canAllowFree,
				freeAllow);
		this.producedResource = producedResource;
		this.resourceAmount = resourceAmount;
	}

	public Resources[] getProducedResource() {
		return producedResource;
	}

	public Integer getResourceAmount() {
		return resourceAmount;
	}
}
